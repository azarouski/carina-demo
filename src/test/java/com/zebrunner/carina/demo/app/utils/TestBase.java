package com.zebrunner.carina.demo.app.utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.MutableCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.invoke.MethodHandles;
import java.net.URL;
import java.time.Duration;

public class TestBase {

    public AppiumDriver driver;
    protected static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());


    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
//        LOGGER.info("----------------------");
//        LOGGER.info(System.getenv("DEVICEFARM_LOG_DIR"));
//        LOGGER.info("----------------------");
        MutableCapabilities capabilities = new MutableCapabilities();
//        capabilities.setCapability("selenium:logLink", System.getenv("DEVICEFARM_LOG_DIR"));
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//        driver = new AppiumDriver(new URL("https://demo.zebrunner.farm/mcloud/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }


    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
