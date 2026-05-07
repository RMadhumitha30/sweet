package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {

        super(driver);
        this.driver = driver;
    }

    By loginLink = By.linkText("Login");

    By emailField = By.id("exampleInputEmail");

    By passwordField = By.id("exampleInputPassword");

    By loginButton = By.xpath("//button[text()='Login']");

    public void clickLoginLink() {

        click(loginLink);
    }

    public void enterEmail(String email) {

        type(emailField, email);
    }

    public void enterPassword(String password) {

        type(passwordField, password);
    }

    public void clickLoginButton() {

        click(loginButton);
    }
}
