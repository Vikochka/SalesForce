package tests;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import madels.Contact;
import org.testng.annotations.Test;

public class ContactsTest extends BaseTest{
    @Test(description = "Creation of contact")
    @Description("I'm creating contact")
    //@Severity(SeverityLevel.BLOCKER)
    @Attachment(value = "screenshot", type = "image/png")
    @Step("opening contact page")
    public void createContact() {
        loginPage.login();
        contactsPage.openPage();
        Contact contact = new Contact("Vasia", "Pupkin", "PupVasia", "+375255234955", "80295445484");
        //BUILDER pattern
        //FACTORY

        contactsPage.create(contact);
    }
}