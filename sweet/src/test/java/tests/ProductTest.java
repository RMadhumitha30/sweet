package tests;

import org.testng.annotations.Test;
import pages.SweetsPage;
import utils.DriverFactory;

public class ProductTest {

    @Test
    public void productAutomationTest() {

        DriverFactory.setupBrowser();

        SweetsPage sweetsPage = new SweetsPage(DriverFactory.driver);

        sweetsPage.clickSweetsLink();

        sweetsPage.openFirstProduct();

        sweetsPage.clickAddToBasket();

        DriverFactory.driver.quit();
    }
}