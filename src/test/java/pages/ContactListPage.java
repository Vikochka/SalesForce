package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactListPage extends BasePage {
    public static final By NEW_BUTTON = By.cssSelector("[title=New]");

    public ContactListPage(WebDriver driver) {
        super(driver);
    }

    @Step("Openinng contact age")
    public void open() {
        driver.get(URL + "/lightning/o/Contact/list?filterName=Recent");
    }

    @Step("Click new")
    public void clickNew() {
        driver.findElement(NEW_BUTTON);
    }
}
