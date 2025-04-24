package com.qacart.tasky.testcases.subscription;

import com.qacart.tasky.bases.BaseTest;
import com.qacart.tasky.pages.DashboardPage;
import com.qacart.tasky.pages.LoginPage;
import com.qacart.tasky.pages.SubscriptionPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CancelSubscriptionTest extends BaseTest {
    private final LoginPage loginPage = new LoginPage();
    private final SubscriptionPage subscriptionPage = new SubscriptionPage();
    private final DashboardPage dashboardPage = new DashboardPage();
    @BeforeMethod
    void setUp() {
        loginPage.load();
        loginPage.loginSubscribedUser();
        dashboardPage.load();
        dashboardPage.goToSubscriptionTab();
    }

    @Test
    void upgradeButtonShouldBeEnabledAfterSuccessfulSubscriptionInSubscriptionTab() {
        subscriptionPage.cancelSubscription();
        Assert.assertTrue(subscriptionPage.isUpgradeButtonEnabled());
    }
}
