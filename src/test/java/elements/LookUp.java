package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LookUp {
    WebDriver driver;
    String label;
    String lacator = "//*[contains(text(),'%s')]/ancestor::lightning-lookup//input";
    String optionsLocator = "//lightning-base-combobox-formatted-text[@title='%s']";

    public LookUp(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void select(String text) {
        driver.findElement(By.xpath(String.format(lacator, label))).sendKeys(text);
        try {
            driver.findElement(By.xpath(String.format(optionsLocator, text))).click();
        } catch (NoSuchElementException ex) {
            Assert.fail(String.format("Cannot find option '%s'", text));
        }
        //  driver.findElement(By.xpath(String.format(optionsLocator, text))).sendKeys(text);
    }

}
