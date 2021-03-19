package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
   public static final String URL = "https://teachmeskillsqa.my.salesforce.com";
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver browser) {
        this.driver = browser;
        wait = new WebDriverWait(browser, 10);
    }
}
