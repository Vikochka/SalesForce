package pages;

import elements.Picklist;
import elements.TextArea;
import io.qameta.allure.Step;
import modals.Contact;

import org.openqa.selenium.By;
import elements.Input;
import org.openqa.selenium.WebDriver;
import elements.LookUp;

public class NewContactModal extends BasePage {
    public static final By SAVE_BUTTON = By.cssSelector("[name='SaveEdit']");

    public NewContactModal(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get("https://teachmeskillsqa.lightning.force.com/lightning/o/Contact/new?count=2&nooverride=1&useRecordTypeCheck=1&navigationLocation=MRU_LIST&backgroundContext=%2Flightning%2Fo%2FContact%2Flist%3FfilterName%3DRecent");
    }

    @Step("Creating contact: {contact.lastName}")
    public void create(Contact contact) {
//        new Picklist(driver, "Salutation").chose(contact.getSalutation());
        new Input(driver, "Last Name").write(contact.getLastName());
        new Input(driver, "First Name").write(contact.getFirstName());
        new Input(driver, "Mobile").write(contact.getMobile());
        new Input(driver, "Phone").write(contact.getPhone());
        new LookUp(driver, "Account Name").select(contact.getAccountName());
        new LookUp(driver, "Reports To").select(contact.getReportsTo());
        new Input(driver, "Email").write(contact.getMail());

    //    new TextArea(driver, "Mailing Street").writeTextArea(contact.getMailingStreet());
        new Input(driver, "Mailing City").write(contact.getMailingCity());
        new Input(driver, "Mailing State/Province").write(contact.getMailingStateProvince());
        new Input(driver, "Mailing Zip/Postal Code").write(contact.getMailingZipPostalCode());
        new Input(driver, "Mailing State/Province").write(contact.getMailingStateProvince());
        new Input(driver, "Mailing Country").write(contact.getMailingCountry());

      //  new TextArea(driver, "Other Street").writeTextArea(contact.getOtherStreet());
        new Input(driver, "Other City").write(contact.getOtherCity());
        new Input(driver, "Other State/Province").write(contact.getOtherState());
        new Input(driver, "Other Zip/Postal Code").write(contact.getOtherZipPostalCode());
        new Input(driver, "Other Country").write(contact.getOtherCountry());

        new Input(driver, "Fax").write(contact.getFax());
        new Input(driver, "Home Phone").write(contact.getHomePhone());
        new Input(driver, "Other Phone").write(contact.getOtherPhone());
        new Input(driver, "Asst. Phone").write(contact.getAsstPhone());
        new Input(driver, "Assistant").write(contact.getFax());
        new Input(driver, "Department").write(contact.getDepartment());
    //    new Picklist(driver, "Lead Source").chose(contact.getOtherPhone());
        new Input(driver, "Birthdate").write(contact.getBirthDate());
      //  new TextArea(driver, "Description").writeTextArea(contact.getDescription());
    }

    @Step("Click 'Save'")
    public void save() {
        driver.findElement(SAVE_BUTTON).click();
    }
}

