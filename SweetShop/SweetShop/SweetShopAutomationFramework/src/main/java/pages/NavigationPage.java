package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationPage {

    private final WebDriver driver;

    private final By brandLink = By.linkText("Sweet Shop");
    private final By sweetsLink = By.linkText("Sweets");
    private final By aboutLink = By.linkText("About");
    private final By loginLink = By.linkText("Login");
    private final By basketLink = By.partialLinkText("Basket");
    private final By pageHeading = By.tagName("h1");

    public NavigationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openHome() {
        driver.findElement(brandLink).click();
    }

    public void openSweets() {
        driver.findElement(sweetsLink).click();
    }

    public void openAbout() {
        driver.findElement(aboutLink).click();
    }

    public void openLogin() {
        driver.findElement(loginLink).click();
    }

    public void openBasket() {
        driver.findElement(basketLink).click();
    }

    public String getHeading() {
        return driver.findElement(pageHeading).getText();
    }

    public String getBasketText() {
        return driver.findElement(basketLink).getText();
    }
}
