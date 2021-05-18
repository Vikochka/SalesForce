package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDown {
    WebDriver driver;
    String label;
    String locator = "//*[contains(text(),'%s')]/ancestor::lightning-picklist//input";
    String optionLocator = "//*[text()='%s']";

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void choose(String text) {
        driver.findElement(By.xpath(String.format(locator, label))).sendKeys(text);
        driver.findElement(By.xpath(String.format(optionLocator, text))).click();
    }
}
