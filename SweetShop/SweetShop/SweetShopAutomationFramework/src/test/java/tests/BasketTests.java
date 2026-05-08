package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasketPage;
import pages.NavigationPage;
import pages.ProductPage;

public class BasketTests extends BaseTest {

    @Test
    public void verifyBasketUpdatesAfterAddingProduct() {
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.openSweets();

        ProductPage productPage = new ProductPage(driver);
        productPage.addFirstProductToBasket();
        navigationPage.openBasket();

        BasketPage basketPage = new BasketPage(driver);

        Assert.assertEquals(basketPage.getHeading(), "Your Basket");
        Assert.assertTrue(basketPage.getBasketSummary().contains("Chocolate Cups"), "Basket should contain added product");
        Assert.assertEquals(basketPage.getTotal(), "£1.00");
    }

    @Test
    public void verifyBasketCheckoutFormDisplays() {
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.openBasket();

        BasketPage basketPage = new BasketPage(driver);

        Assert.assertEquals(basketPage.getHeading(), "Your Basket");
        Assert.assertTrue(basketPage.isCheckoutFormDisplayed(), "Basket checkout form should be displayed");
    }
}
