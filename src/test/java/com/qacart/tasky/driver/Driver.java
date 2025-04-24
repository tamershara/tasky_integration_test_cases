package com.qacart.tasky.driver;


import com.qacart.tasky.driver.factory.Factory;
import com.qacart.tasky.driver.manager.DriverManager;
import org.openqa.selenium.WebDriver;

public final class Driver {
    private Driver() {}
    public static void initDriver(){
            WebDriver driver = Factory.initDriver();
            DriverManager.setDriver(driver);
    }
}
