package com.qacart.tasky.testcases.subscription;

import com.qacart.tasky.bases.BaseTest;
import com.qacart.tasky.model.CreditCard;
import com.qacart.tasky.pages.DashboardPage;
import com.qacart.tasky.pages.LoginPage;
import com.qacart.tasky.pages.SubscriptionPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.qacart.tasky.fixtures.CardFixture.getDefaultCardInfo;

public class SuccessfulSubscriptionTest extends BaseTest {
    private final LoginPage loginPage = new LoginPage();
    private final SubscriptionPage subscriptionPage = new SubscriptionPage();
    private final DashboardPage dashboardPage = new DashboardPage();
    @BeforeMethod
    public void setUp() {
        loginPage.load();
        loginPage.loginRegularUser();
        dashboardPage.load();
        dashboardPage.goToSubscriptionTab();
    }

    @Test
    public void upgradeButtonShouldBeDisabledAfterSuccessfulSubscriptionInSubscriptionTab() {
        CreditCard card = getDefaultCardInfo();
        subscriptionPage.subscribe(card);
        Assert.assertFalse(subscriptionPage.isUpgradeButtonEnabled());
    }
}
