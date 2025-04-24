package com.qacart.tasky.driver.managers;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import static com.qacart.tasky.driver.managers.DriverManager.getDriver;

public final class FirefoxManager {
    private FirefoxManager() {
    }

    public static FirefoxDriver getFirefoxDriver() {
        return new FirefoxDriver(getFirefoxOptions());
    }

    public static FirefoxOptions getFirefoxOptions() {
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("localhost:8091");
        proxy.setSslProxy("localhost:8091");
        FirefoxOptions options = new FirefoxOptions();
        options.setProxy(proxy);
        options.setAcceptInsecureCerts(true);
        return options;
    }
}
