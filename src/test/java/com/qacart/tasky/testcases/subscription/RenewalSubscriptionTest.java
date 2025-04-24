package com.qacart.tasky.testcases.subscription;

import com.qacart.tasky.bases.BaseTest;
import com.qacart.tasky.pages.DashboardPage;
import com.qacart.tasky.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RenewalSubscriptionTest extends BaseTest {
    private final LoginPage loginPage = new LoginPage();
    private final DashboardPage dashboardPage = new DashboardPage();
    @BeforeMethod
    void setUp() {
        loginPage.load();
        loginPage.loginSubscribedUser();
        dashboardPage.load();
    }

    @Test
    void renewalButtonShouldBeDisplayedIfTheSubscriptionEndDateIsCloseToEndByTwoDays(){
        dashboardPage.makeTheUserCloseToBeExpired();
        dashboardPage.load();
        Assert.assertTrue(dashboardPage.isRenewButtonPresent());
    }
}
