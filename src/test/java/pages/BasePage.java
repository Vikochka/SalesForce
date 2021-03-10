package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver browser) {
        this.driver = browser;
        wait = new WebDriverWait(browser, 10);
    }
}
