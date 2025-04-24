package com.qacart.tasky.pages;

import com.qacart.tasky.bases.BasePage;

import static com.qacart.tasky.configs.ConfigFactory.getConfig;
import static com.qacart.tasky.driver.managers.DriverManager.getDriver;
import static com.qacart.tasky.mocker.ProfileMock.mockRegularProfile;
import static com.qacart.tasky.mocker.SubscriptionAPIsMock.mockSubscriptionTypes;
import static com.qacart.tasky.utils.CookiesUtility.loadCookiesRegularUser;

public class LoginPage implements BasePage {

    @Override
    public void load() {
        getDriver().get(getConfig().pageBaseURL() + "/login");
    }


    public void loginRegularUser() {
        mockRegularProfile();
        mockSubscriptionTypes();
        loadCookiesRegularUser();
    }

}
