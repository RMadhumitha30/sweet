package base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.DriverFactory;

public class BaseTest {

    protected static final String BASE_URL = "https://sweetshop.netlify.app";
    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = DriverFactory.initializeDriver();
        driver.get(BASE_URL);
        ((JavascriptExecutor) driver).executeScript("localStorage.clear(); sessionStorage.clear();");
    }

    @AfterMethod
    public void tearDown() {
        if (Boolean.parseBoolean(System.getProperty("keepBrowserOpen", "false"))) {
            return;
        }
        if (driver != null) {
            driver.quit();
        }
    }
}
