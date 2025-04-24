package com.qacart.tasky.pages;

import com.qacart.tasky.bases.BasePage;
import com.qacart.tasky.model.CreditCard;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.qacart.tasky.configs.ConfigFactory.getConfig;
import static com.qacart.tasky.driver.manager.DriverManager.getDriver;
import static com.qacart.tasky.mocker.CurrentSubscriptionMock.mockActivatedCurrentSubscription;
import static com.qacart.tasky.mocker.ProfileMock.mockCancelledProfile;
import static com.qacart.tasky.mocker.ProfileMock.mockSubscribedProfile_1;
import static com.qacart.tasky.mocker.SubscriptionAPIsMock.mockSuccessfulCancelSubscriptionResponse;
import static com.qacart.tasky.mocker.SubscriptionAPIsMock.mockSuccessfulSubscriptionResponse;

public class SubscriptionPage implements BasePage {
   private final By upgradeButtonLocator = By.xpath("//button[normalize-space()='Upgrade']");
   private final By cardNumberLocator = By.name("cardNumber");
   private final By expiryMonthLocator = By.name("expiryMonth");
   private final By expiryYearLocator = By.name("expiryYear");
   private final By cvvLocator = By.name("cvv");
   private final By subscribeButtonLocator = By.className("css-1dzsn8i");
   private final By cancelButtonLocator = By.className("css-1hxvka0");
   private final By confirmCancellationButtonLocator = By.className("css-qhzfj");

   @Step
    @Override
    public void load() {
        getDriver().get(getConfig().pageBaseURL() + "/dashboard/subscription");
    }

    @Step
    private void mockSubscriptionFlowAPIResponse() {
        mockSubscribedProfile_1();
        mockActivatedCurrentSubscription();
        mockSuccessfulSubscriptionResponse();
    }

    @Step
    public void subscribe(CreditCard cardInfo){
        mockSubscriptionFlowAPIResponse();
        getDriver().findElement(upgradeButtonLocator).click();
        getDriver().findElement(cardNumberLocator).sendKeys(cardInfo.getCardNumber());
        getDriver().findElement(expiryMonthLocator).sendKeys(cardInfo.getExpiryMonth());
        getDriver().findElement(expiryYearLocator).sendKeys(cardInfo.getExpiryYear());
        getDriver().findElement(cvvLocator).sendKeys(cardInfo.getCvv());
        getDriver().findElement(subscribeButtonLocator).click();
    }

    @Step
    public boolean isUpgradeButtonEnabled() {
        return getDriver().findElement(upgradeButtonLocator).isEnabled();
    }

    @Step
    private void mockCancelSubscriptionAPIResponse() {
        mockCancelledProfile();
        mockSuccessfulCancelSubscriptionResponse();
    }

    @Step
    public void cancelSubscription() {
        mockCancelSubscriptionAPIResponse();
        getDriver().findElement(cancelButtonLocator).click();
        getDriver().findElement(confirmCancellationButtonLocator).click();
    }

}

