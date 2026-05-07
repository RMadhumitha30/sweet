package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginTest {

    @Test
    public void validLoginTest() {

        DriverFactory.setupBrowser();

        LoginPage loginPage = new LoginPage(DriverFactory.driver);

        loginPage.clickLoginLink();

        loginPage.enterEmail("oneorder@sweetshop.local");

        loginPage.enterPassword("qwerty");

        loginPage.clickLoginButton();
    }
}