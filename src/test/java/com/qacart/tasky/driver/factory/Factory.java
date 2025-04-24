package com.qacart.tasky.driver.factory;

import com.qacart.tasky.configs.ConfigFactory;
import com.qacart.tasky.driver.manager.ChromeManager;
import com.qacart.tasky.driver.manager.FirefoxManager;
import com.qacart.tasky.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public final class Factory {
    public static final Map<BrowserType, Supplier<WebDriver>> DRIVER_MAP = new HashMap<BrowserType,Supplier<WebDriver>>();
    //private static final Supplier<WebDriver> chromeSupplier = ChromeManager::getChromeDriver;
    //private static final Supplier<WebDriver> firefoxSupplier = FirefoxManager::getFirefoxDriver;
    static
    {
        DRIVER_MAP.put(BrowserType.CHROME, ChromeManager::getChromeDriver);
        DRIVER_MAP.put(BrowserType.FIREFOX, FirefoxManager::getFirefoxDriver);
    }
    private Factory() {} // here to prevent people to create an object from this class
    public static WebDriver initDriver() {
        return DRIVER_MAP.get(ConfigFactory.getConfig().browser()).get();
    }
}
