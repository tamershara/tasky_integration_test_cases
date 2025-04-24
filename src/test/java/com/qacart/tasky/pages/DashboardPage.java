package com.qacart.tasky.pages;

import com.qacart.tasky.bases.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.qacart.tasky.configs.ConfigFactory.getConfig;
import static com.qacart.tasky.driver.manager.DriverManager.getDriver;
import static com.qacart.tasky.mocker.CurrentSubscriptionMock.mockSubscribedCurrentSubscriptionToBeCloseToExpired;

public class DashboardPage implements BasePage {
    private final By subscriptionTabLocator = By.cssSelector("[data-testid='SubscriptionsIcon']");
    private final By renewButtonLocator = By.id(":r5:");

    @Step
    @Override
    public void load() {
        getDriver().get(getConfig().pageBaseURL() + "/dashboard");
    }

    @Step
    public void goToSubscriptionTab() {
        getDriver().findElement(subscriptionTabLocator).click();
    }

    @Step
    public void makeTheUserCloseToBeExpired(){
        mockSubscribedCurrentSubscriptionToBeCloseToExpired();
    }

    @Step
    public boolean isRenewButtonPresent() {
        return getDriver().findElement(renewButtonLocator).isDisplayed();
    }
}