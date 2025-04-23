package com.qacart.tasky.pages;

import com.qacart.tasky.bases.BasePage;

import static com.qacart.tasky.configs.ConfigFactory.getConfig;
import static com.qacart.tasky.driver.managers.DriverManager.getDriver;

public class LoginPage implements BasePage {

    @Override
    public void load() {
        getDriver().get(getConfig().pageBaseURL() + "/login");
    }

}
