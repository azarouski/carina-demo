package com.zebrunner.carina.demo.app.pages.android;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CarinaDescriptionPage extends BasePage {

    @FindBy(id = "content_frame")
    private WebElement webViewContent;

    public CarinaDescriptionPage(AppiumDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return webViewContent.isDisplayed();
    }

}