package com.qacart.tasky.utils;



import org.openqa.selenium.Cookie;

import static com.qacart.tasky.configs.ConfigFactory.getConfig;
import static com.qacart.tasky.driver.manager.DriverManager.getDriver;


public final class CookiesUtility {
    private CookiesUtility() {
    }

    public static void loadCookiesRegularUser() {
        Cookie access_token = new Cookie("access_token", getConfig().regularUserCookies());
        getDriver().manage().addCookie(access_token);
        getDriver().navigate().refresh();
    }

    public static void loadCookiesSubscribedUser() {
        Cookie accessToken = new Cookie("access_token", getConfig().subscribedUserCookies());
        getDriver().manage().addCookie(accessToken);
        getDriver().navigate().refresh();
    }

}
