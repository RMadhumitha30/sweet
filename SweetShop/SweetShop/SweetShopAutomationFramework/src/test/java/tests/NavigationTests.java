package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NavigationPage;

public class NavigationTests extends BaseTest {

    @Test
    public void verifyMainNavigationLinks() {
        NavigationPage navigationPage = new NavigationPage(driver);

        navigationPage.openSweets();
        Assert.assertEquals(navigationPage.getHeading(), "Browse sweets");

        navigationPage.openAbout();
        Assert.assertEquals(navigationPage.getHeading(), "Sweet Shop Project");

        navigationPage.openLogin();
        Assert.assertEquals(navigationPage.getHeading(), "Login");

        navigationPage.openBasket();
        Assert.assertEquals(navigationPage.getHeading(), "Your Basket");

        navigationPage.openHome();
        Assert.assertEquals(navigationPage.getHeading(), "Welcome to the sweet shop!");
    }
}
