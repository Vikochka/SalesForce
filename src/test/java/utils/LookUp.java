package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LookUp {
    WebDriver driver;
    String label;
    String lacator = "//*[contains(text(),'%s')]/ancestor::lightning-lookup//input";
    String optionsLocator="//lightning-base-combobox-formatted-text[@title='%s']";

    public LookUp(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void select(String text) {
        driver.findElement(By.xpath(String.format(lacator, label))).sendKeys(text);
        driver.findElement(By.xpath(String.format(optionsLocator, text))).sendKeys(text);
    }
}
