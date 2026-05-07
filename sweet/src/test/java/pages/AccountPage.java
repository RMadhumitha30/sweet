package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {

    WebDriver driver;

    public AccountPage(WebDriver driver) {

        super(driver);
        this.driver = driver;
    }

    By accountLink = By.cssSelector("a[href='/account']");

    By orderHistory = By.xpath("//*[contains(text(),'Order History')]");

    public void openAccount() {

        click(accountLink);
    }

    public boolean isOrderHistoryDisplayed() {

        return find(orderHistory).isDisplayed();
    }
}