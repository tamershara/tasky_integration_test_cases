package com.qacart.tasky.testcases.subscription;

import com.qacart.tasky.bases.BaseTest;
import com.qacart.tasky.pages.DashboardPage;
import com.qacart.tasky.pages.LoginPage;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Feature("Subscription")
public class RenewalSubscriptionTest extends BaseTest {
    private final LoginPage loginPage = new LoginPage();
    private final DashboardPage dashboardPage = new DashboardPage();
    @BeforeMethod
    void setUp() {
        loginPage.load();
        loginPage.loginSubscribedUser();
        dashboardPage.load();
    }

    @Story("Renewal subscription test cases")
    @Test(description = "Renewal button should be displayed if the subscription end date is close to end by two days")
    void renewalButtonShouldBeDisplayedIfTheSubscriptionEndDateIsCloseToEndByTwoDays(){
        dashboardPage.makeTheUserCloseToBeExpired();
        dashboardPage.load();
        Assert.assertTrue(dashboardPage.isRenewButtonPresent());
    }
}
