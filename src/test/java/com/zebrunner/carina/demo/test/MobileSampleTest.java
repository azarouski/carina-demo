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

    @Test()
    public void testLoginUser1() {
        LOGGER.info("Test start1");
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

    @Test()
    public void testLoginUser2() {
        LOGGER.info("Test start2");
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

    @Test()
    public void testLoginUser3() {
        LOGGER.info("Test start3");
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

    @Test()
    public void testLoginUser4() {
        LOGGER.info("Test start4");
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

    @Test()
    public void testLoginUser5() {
        LOGGER.info("Test start5");
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

    @Test()
    public void testLoginUser6() {
        LOGGER.info("Test start6");
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

    @Test()
    public void testLoginUser7() {
        LOGGER.info("Test start7");
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

    @Test()
    public void testLoginUser8() {
        LOGGER.info("Test start8");
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

    @Test()
    public void testLoginUser9() {
        LOGGER.info("Test start9");
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

    @Test()
    public void testLoginUser10() {
        LOGGER.info("Test start10");
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

    @Test()
    public void testLoginUser11() {
        LOGGER.info("Test start11");
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

    @Test()
    public void testLoginUser12() {
        LOGGER.info("Test start12");
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

    @Test()
    public void testLoginUser13() {
        LOGGER.info("Test start13");
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

    @Test()
    public void testLoginUser14() {
        LOGGER.info("Test start14");
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

    @Test()
    public void testLoginUser15() {
        LOGGER.info("Test start15");
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
