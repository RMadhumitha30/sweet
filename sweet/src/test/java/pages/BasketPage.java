package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage extends BasePage {

    WebDriver driver;

    public BasketPage(WebDriver driver) {

        super(driver);
        this.driver = driver;
    }

    By basketLink = By.linkText("Basket");

    By removeButton = By.linkText("Delete Item");

    public void openBasket() {

        click(basketLink);
    }

    public void removeProduct() {

        click(removeButton);
    }
}