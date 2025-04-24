package com.qacart.tasky.testcases.subscription;

import com.qacart.tasky.bases.BaseTest;
import com.qacart.tasky.pages.DashboardPage;
import com.qacart.tasky.pages.LoginPage;
import com.qacart.tasky.pages.SubscriptionPage;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Feature("Subscription")
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

    @Story("Cancel subscription test cases")
    @Test(description = "Upgrade button in subscription page should be enabled if the user cancel subscription")
    void upgradeButtonShouldBeEnabledAfterSuccessfulSubscriptionInSubscriptionTab() {
        subscriptionPage.cancelSubscription();
        Assert.assertTrue(subscriptionPage.isUpgradeButtonEnabled());
    }
}
