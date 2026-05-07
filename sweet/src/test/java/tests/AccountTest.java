package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.LoginPage;
import utils.DriverFactory;

public class AccountTest {

    @Test
    public void accountPageTest() {

        DriverFactory.setupBrowser();

        LoginPage loginPage = new LoginPage(DriverFactory.driver);

        loginPage.clickLoginLink();

        loginPage.enterEmail("oneorder@sweetshop.local");

        loginPage.enterPassword("qwerty");

        loginPage.clickLoginButton();

        AccountPage accountPage = new AccountPage(DriverFactory.driver);

        accountPage.openAccount();

        String currentUrl = DriverFactory.driver.getCurrentUrl();

        System.out.println(currentUrl);

        Assert.assertTrue(currentUrl.contains("account"));

        DriverFactory.driver.quit();
    }
}