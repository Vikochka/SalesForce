package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Picklist {
    WebDriver driver;
    String label;
    String pickListLacator = "//*[contains(text(),'Salutation')]/ancestor::lightning-picklist//input";
    String optionsPickListLocator ="//lightning-base-combobox-formatted-text[@title='%s']";

    public Picklist(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void chose(String text) {
        driver.findElement(By.xpath(String.format(pickListLacator, label))).sendKeys(text);
        try {
            driver.findElement(By.xpath(String.format(optionsPickListLocator, text))).click();
        } catch (NoSuchElementException ex) {
            Assert.fail(String.format("Cannot find option '%s'", text));
        }
    }
}
