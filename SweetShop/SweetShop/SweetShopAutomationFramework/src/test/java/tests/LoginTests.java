package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTest {

    @Test
    public void verifyLoginPage() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.clickLoginMenu();

        Assert.assertEquals(loginPage.getHeading(), "Login");
        Assert.assertTrue(loginPage.isLoginFormDisplayed(), "Login form should be displayed");
    }
}
