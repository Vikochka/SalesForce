package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea {
    WebDriver driver;
    String label;
    String textAreaLacator = "//*[contains(text(),'%s)]/ancestor::lightning-textarea";

    public TextArea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void writeTextArea(String text) {
        driver.findElement(By.xpath(String.format(textAreaLacator, label))).sendKeys(text);
    }

}
