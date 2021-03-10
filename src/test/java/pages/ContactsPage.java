package pages;

import io.qameta.allure.Step;
import madels.Contact;

import utils.Input;
import org.openqa.selenium.WebDriver;
import utils.LookUp;

public class ContactsPage extends BasePage {


    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get("https://teachmeskillsqa.lightning.force.com/lightning/o/Contact/new?count=2&nooverride=1&useRecordTypeCheck=1&navigationLocation=MRU_LIST&backgroundContext=%2Flightning%2Fo%2FContact%2Flist%3FfilterName%3DRecent");
    }

    @Step("Creating contact: {contact.lastName}")
    public void create(Contact contact) {
        new Input(driver, "Last Name").write(contact.getLastName());
        new Input(driver, "First Name").write(contact.getFirstName());
        new Input(driver, "Mobile").write(contact.getMobile());
        new Input(driver, "Phone").write(contact.getPhone());
        new LookUp(driver, "Account Name").select(contact.getAccountName());
    }
}
//       driver.findElement(By.xpath("//*[contains(text(),'Account Name')]/ancestor::lightning-lookup//input")).sendKeys(lastName);
