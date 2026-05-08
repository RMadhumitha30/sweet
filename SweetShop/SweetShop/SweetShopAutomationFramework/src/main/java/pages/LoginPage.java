package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By loginLink = By.linkText("Login");
    private final By pageHeading = By.tagName("h1");
    private final By emailInput = By.id("exampleInputEmail");
    private final By passwordInput = By.id("exampleInputPassword");
    private final By loginButton = By.cssSelector("button[type='submit']");

    public void clickLoginMenu() {
        driver.findElement(loginLink).click();
    }

    public String getHeading() {
        return driver.findElement(pageHeading).getText();
    }

    public boolean isLoginFormDisplayed() {
        return driver.findElement(emailInput).isDisplayed()
                && driver.findElement(passwordInput).isDisplayed()
                && driver.findElement(loginButton).isDisplayed();
    }
}
