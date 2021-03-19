package tests;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import modals.Contact;
import org.testng.annotations.Test;

public class ContactsTest extends BaseTest {
    String login = "er.viktoria1919-ck6r@force.com";
    String password = "Hipstr19";

    @Test(description = "Creation of contact")
    @Description("I'm creating contact")
    //@Severity(SeverityLevel.BLOCKER)
    @Attachment(value = "screenshot", type = "image/png")
    @Step("opening contact page")
    public void createContact() {
        loginSteps.login(login, password);

        Contact contact = new Contact("Vika","Yermakovich","Vikaka","Ms.","I'm a new user",
                "80255234955","3518792","er.viktoria19@gmail.com","Yermakovich","Lobanok",
                "-","Minsk","-","-","-","-","220136",
                "Belarus","-","-","-","-","-",
                "35666653555","-","-","Social","09/19/2000","hahahaha");
        contactSteps.create(contact);
        //BUILDER pattern
        //FACTORY

        //нехватает валидации
    }
}