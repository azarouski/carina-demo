package com.zebrunner.carina.demo.app.pages.android;

import io.appium.java_client.AppiumDriver;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {

    @FindBy(id = "name")
    private WebElement nameInputField;

    @FindBy(id = "password")
    private WebElement passwordInputField;

    @FindBy(id = "radio_male")
    private WebElement maleRadioBtn;

    @FindBy(id = "radio_female")
    private WebElement femaleRadioBtn;

    @FindBy(id = "checkbox")
    private WebElement privacyPolicyCheckbox;

    @FindBy(id = "login_button")
    private WebElement loginBtn;

    public LoginPage(AppiumDriver<?> driver) {
        super(driver);
    }

    public void typeName(String name) {
        nameInputField.sendKeys(name);
    }

    public void typePassword(String password) {
        passwordInputField.sendKeys(password);
    }

    public void selectMaleSex() {
        maleRadioBtn.click();
    }

    public void checkPrivacyPolicyCheckbox() {
        privacyPolicyCheckbox.click();
    }

    public CarinaDescriptionPage clickLoginBtn() {
        loginBtn.click();
        return new CarinaDescriptionPage(driver);
    }

    public boolean isLoginBtnActive() {
        return Boolean.parseBoolean(loginBtn.getAttribute("enabled"));
    }

    public void login() {
        String username = "Test user";
        String password = RandomStringUtils.randomAlphabetic(10);
        typeName(username);
        typePassword(password);
        selectMaleSex();
        checkPrivacyPolicyCheckbox();
        loginBtn.click();
    }

}
