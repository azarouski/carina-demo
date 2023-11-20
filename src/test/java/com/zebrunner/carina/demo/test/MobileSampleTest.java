package com.zebrunner.carina.demo.test;

import com.zebrunner.carina.demo.app.pages.android.CarinaDescriptionPage;
import com.zebrunner.carina.demo.app.pages.android.LoginPage;
import com.zebrunner.carina.demo.app.pages.android.WelcomePage;
import com.zebrunner.carina.demo.app.utils.TestBase;
import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;


public class MobileSampleTest extends TestBase {

    @Test()
    public void testLoginUser() {
        LOGGER.info("Test start");
        String username = "Test user";
        String password = RandomStringUtils.randomAlphabetic(10);;
        WelcomePage welcomePage = new WelcomePage(driver);
        Assert.assertTrue(welcomePage.isPageOpened(), "Welcome page isn't opened");
        LoginPage loginPage = welcomePage.clickNextBtn();
        Assert.assertFalse(loginPage.isLoginBtnActive(), "Login button is active when it should be disabled");
        LOGGER.info("Test middle");
        loginPage.typeName(username);
        loginPage.typePassword(password);
        loginPage.selectMaleSex();
        loginPage.checkPrivacyPolicyCheckbox();
        CarinaDescriptionPage carinaDescriptionPage = loginPage.clickLoginBtn();
        Assert.assertTrue(carinaDescriptionPage.isPageOpened(), "Carina description page isn't opened");
        LOGGER.info("Test finish");
    }
}
