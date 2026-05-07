package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SweetsPage extends BasePage {

    WebDriver driver;

    public SweetsPage(WebDriver driver) {

        super(driver);
        this.driver = driver;
    }

    By sweetsLink = By.linkText("Sweets");

    By firstProduct = By.xpath("(//h4)[1]");
    By addToBasketButton = By.xpath("//button[contains(text(),'Add to cart')]");

    public void clickSweetsLink() {

        click(sweetsLink);
    }

    public void openFirstProduct() {

        click(firstProduct);
    }

    public void clickAddToBasket() {

        click(addToBasketButton);
    }
}