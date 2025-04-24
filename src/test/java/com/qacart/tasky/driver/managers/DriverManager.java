package com.qacart.tasky.driver.managers;


import org.openqa.selenium.WebDriver;

public final class DriverManager {
    private DriverManager() {
    }

    public static WebDriver driver;

    public static WebDriver getDriver() {
        driver.manage().window().maximize();
        return driver;
    }

    public static void setDriver(WebDriver driverValue) {
        driver = driverValue;
    }
}
