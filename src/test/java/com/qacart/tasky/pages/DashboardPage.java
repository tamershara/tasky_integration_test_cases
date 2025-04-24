package com.qacart.tasky.pages;

import com.qacart.tasky.bases.BasePage;
import org.openqa.selenium.By;

import static com.qacart.tasky.configs.ConfigFactory.getConfig;
import static com.qacart.tasky.driver.managers.DriverManager.getDriver;

public class DashboardPage implements BasePage {
    private final By subscriptionTabLocator = By.cssSelector("[data-testid='SubscriptionsIcon']");
    private final By renewButtonLocator = By.id(":r5:");

    @Override
    public void load() {
        getDriver().get(getConfig().pageBaseURL() + "/dashboard");
    }

    public void goToSubscriptionTab() {
        getDriver().findElement(subscriptionTabLocator).click();
    }

    public boolean isRenewButtonPresent() {
        return getDriver().findElement(renewButtonLocator).isDisplayed();
    }
}