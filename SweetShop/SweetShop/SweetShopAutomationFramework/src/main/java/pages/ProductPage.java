package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage {

    private final WebDriver driver;

    private final By pageHeading = By.tagName("h1");
    private final By productNames = By.cssSelector(".card-title");
    private final By addToBasketButtons = By.xpath("//a[normalize-space()='Add to Basket']");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeading() {
        return driver.findElement(pageHeading).getText();
    }

    public int getProductCount() {
        return driver.findElements(productNames).size();
    }

    public boolean hasProductNamed(String productName) {
        return driver.findElements(productNames)
                .stream()
                .map(WebElement::getText)
                .anyMatch(productName::equals);
    }

    public void addFirstProductToBasket() {
        driver.findElements(addToBasketButtons).get(0).click();
    }
}
