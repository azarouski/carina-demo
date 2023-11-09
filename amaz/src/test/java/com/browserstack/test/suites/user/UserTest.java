package com.browserstack.test.suites.user;

import com.browserstack.test.suites.TestBase;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest extends TestBase {
    public UserTest() {
    }

    @Test(testName = "loginAndCheckExistingOrders")
    public void loginAndCheckExistingOrders() {
        By ordersMenuItem = mobileHelper.isAndroid() ? MobileBy.xpath("//*[@text = 'Orders']") : MobileBy.id("Orders");
        driver.findElement(MobileBy.AccessibilityId("menu")).click();
        driver.findElement(MobileBy.AccessibilityId("nav-signin")).click();
        driver.findElement(MobileBy.AccessibilityId("username-input")).click();
        mobileHelper.selectFromPickerWheel("//XCUIElementTypePickerWheel[@value='Accepted usernames are']", "existing_orders_user");
        driver.findElement(MobileBy.AccessibilityId("password-input")).click();
        mobileHelper.selectFromPickerWheel("//XCUIElementTypePickerWheel[@value='Password for all users']", "testingisfun99");
        driver.findElement(MobileBy.AccessibilityId("login-btn")).click();
        driver.findElement(MobileBy.AccessibilityId("menu")).click();
        driver.findElement(ordersMenuItem).click();
        Assert.assertEquals(driver.findElement(MobileBy.AccessibilityId("number-of-orders")).getText(), "5 order(s) found.");
    }
}
