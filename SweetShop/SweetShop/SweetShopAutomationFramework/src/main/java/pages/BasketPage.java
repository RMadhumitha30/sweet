package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage {

    private final WebDriver driver;

    private final By pageHeading = By.tagName("h1");
    private final By basketSummary = By.cssSelector(".list-group");
    private final By total = By.cssSelector(".list-group-item:last-child strong");
    private final By emptyBasketButton = By.linkText("Empty Basket");
    private final By checkoutButton = By.cssSelector("button[type='submit']");

    public BasketPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeading() {
        return driver.findElement(pageHeading).getText();
    }

    public String getBasketSummary() {
        return driver.findElement(basketSummary).getText();
    }

    public String getTotal() {
        return driver.findElement(total).getText();
    }

    public boolean isCheckoutFormDisplayed() {
        return driver.findElement(emptyBasketButton).isDisplayed()
                && driver.findElement(checkoutButton).isDisplayed();
    }
}
