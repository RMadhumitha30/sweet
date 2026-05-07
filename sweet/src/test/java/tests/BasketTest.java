package tests;

import org.testng.annotations.Test;
import pages.BasketPage;
import pages.SweetsPage;
import utils.DriverFactory;

public class BasketTest {

    @Test
    public void basketAutomationTest() {

        DriverFactory.setupBrowser();

        SweetsPage sweetsPage = new SweetsPage(DriverFactory.driver);

        sweetsPage.clickSweetsLink();

        sweetsPage.openFirstProduct();

        sweetsPage.clickAddToBasket();

        BasketPage basketPage = new BasketPage(DriverFactory.driver);

        basketPage.openBasket();

        basketPage.removeProduct();

        DriverFactory.driver.quit();
    }
}