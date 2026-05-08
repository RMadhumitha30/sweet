package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NavigationPage;
import pages.ProductPage;

public class ProductTests extends BaseTest {

    @Test
    public void verifyProductsPageDisplaysSweetItems() {
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.openSweets();

        ProductPage productPage = new ProductPage(driver);

        Assert.assertEquals(productPage.getHeading(), "Browse sweets");
        Assert.assertTrue(productPage.getProductCount() > 0, "Products should be displayed");
        Assert.assertTrue(productPage.hasProductNamed("Chocolate Cups"), "Expected product should be displayed");
    }
}
