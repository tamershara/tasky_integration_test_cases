package com.qacart.tasky.utils;

import org.openqa.selenium.Cookie;

import static com.qacart.tasky.configs.ConfigFactory.getConfig;
import static com.qacart.tasky.driver.managers.DriverManager.getDriver;

public final class CookiesUtility {
    private CookiesUtility() {}

    public static void loadCookies(String userType){
        Cookie cookie;
        switch (userType.toUpperCase()){
            case "REGULAR": {
                cookie = new Cookie("access_token", getConfig().regularUserCookies());
                getDriver().manage().addCookie(cookie);
            }
            break;
            case "ADVANCED": {
                cookie = new Cookie("access_token", getConfig().subscribedUserCookies());
                getDriver().manage().addCookie(cookie);
            }
            break;
            default: throw new RuntimeException("Invalid user type.");
        }
        getDriver().navigate().refresh();
    }

}
