package com.qacart.tasky.pages;

import com.qacart.tasky.bases.BasePage;
import io.qameta.allure.Step;

import static com.qacart.tasky.configs.ConfigFactory.getConfig;
import static com.qacart.tasky.driver.manager.DriverManager.getDriver;
import static com.qacart.tasky.mocker.CurrentSubscriptionMock.mockSubscribedCurrentSubscription;
import static com.qacart.tasky.mocker.ProfileMock.mockRegularProfile;
import static com.qacart.tasky.mocker.ProfileMock.mockSubscribedProfile_2;
import static com.qacart.tasky.mocker.SubscriptionAPIsMock.mockSubscriptionTypes;
import static com.qacart.tasky.utils.CookiesUtility.loadCookiesRegularUser;
import static com.qacart.tasky.utils.CookiesUtility.loadCookiesSubscribedUser;

public class LoginPage implements BasePage {

    @Step
    @Override
    public void load() {
        getDriver().get(getConfig().pageBaseURL() + "/login");
    }

    @Step
    public void loginRegularUser() {
        mockRegularProfile();
        mockSubscriptionTypes();
        loadCookiesRegularUser();
    }

    @Step
    public void loginSubscribedUser() {
        mockSubscribedProfile_2();
        mockSubscriptionTypes();
        mockSubscribedCurrentSubscription();
        loadCookiesSubscribedUser();
    }

}
