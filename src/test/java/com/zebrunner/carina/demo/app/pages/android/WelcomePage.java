package com.zebrunner.carina.demo.app.pages.android;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class WelcomePage extends BasePage {

    @FindBy(id = "carina_logo")
    private WebElement title;

    @FindBy(id = "next_button")
    private WebElement nextBtn;

    public WelcomePage(AppiumDriver<?> driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return title.isDisplayed();
    }

    public LoginPage clickNextBtn() {
        nextBtn.click();
        return new LoginPage(driver);
    }

}
