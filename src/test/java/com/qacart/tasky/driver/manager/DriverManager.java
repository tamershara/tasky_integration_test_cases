package com.qacart.tasky.driver.manager;
import org.openqa.selenium.WebDriver;

public final class DriverManager {

    private static WebDriver driver;
    private DriverManager() {}
    public static WebDriver getDriver() {
        return driver;
    }
    public static void setDriver(WebDriver driverValue) {
        driver = driverValue;
    }
}
