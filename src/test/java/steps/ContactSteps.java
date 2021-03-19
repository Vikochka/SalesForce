package steps;

import io.qameta.allure.Step;
import modals.Contact;
import org.openqa.selenium.WebDriver;
import pages.ContactListPage;
import pages.NewContactModal;

public class ContactSteps {
    WebDriver driver;

    public ContactSteps(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Creating contact: '{contact.lastName}'")
    public void create(Contact contact) {
        ContactListPage contactListPage = new ContactListPage(driver);
        contactListPage.open();
        contactListPage.clickNew();
        NewContactModal newContactModal = new NewContactModal(driver);
        newContactModal.openPage();
        newContactModal.create(contact);
        newContactModal.save();
    }
}
