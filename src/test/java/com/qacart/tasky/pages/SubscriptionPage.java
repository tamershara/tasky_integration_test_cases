package com.qacart.tasky.pages;

import com.qacart.tasky.bases.BasePage;
import org.openqa.selenium.By;

import static com.qacart.tasky.configs.ConfigFactory.getConfig;
import static com.qacart.tasky.driver.managers.DriverManager.getDriver;

public class SubscriptionPage implements BasePage {
   private final By upgradeButtonLocator = By.xpath("//button[normalize-space()='Upgrade']");
   private final By cardNumberLocator = By.name("cardNumber");
   private final By expiryMonthLocator = By.name("expiryMonth");
   private final By expiryYearLocator = By.name("expiryYear");
   private final By cvvLocator = By.name("cvv");
   private final By subscribeButtonLocator = By.className("css-1dzsn8i");
   private final By cancelButtonLocator = By.className("css-1hxvka0");
   private final By confirmCancellationButtonLocator = By.className("css-qhzfj");

    @Override
    public void load() {
        getDriver().get(getConfig().pageBaseURL() + "/dashboard/subscription");
    }

}
