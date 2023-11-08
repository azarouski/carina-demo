package com.browserstack.test.suites;


import com.browserstack.test.utils.MobileHelper;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.MutableCapabilities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public AppiumDriver driver;

    public MobileHelper mobileHelper;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {

        MutableCapabilities capabilities = new MutableCapabilities();
//        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("automationName", "UIAutomator2");
//        capabilities.setCapability("appPackage", "com.browserstack.demo.app");
//        capabilities.setCapability("app", "/Users/aliakseihursevich/Downloads/demoapp.apk");
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        mobileHelper = new MobileHelper(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
