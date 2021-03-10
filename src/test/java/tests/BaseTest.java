package tests;

import org.testng.ITestContext;
import org.testng.annotations.Listeners;
import pages.ContactsPage;
import pages.LoginPage;
import utils.CapabilitiesGenerator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)
public class BaseTest {

    WebDriver browser;
    LoginPage loginPage;
    ContactsPage contactsPage;
    ChromeOptions options = new ChromeOptions();


    @BeforeMethod( description = "Opening browser")
    public void setup(ITestContext context) {
        browser = new ChromeDriver(CapabilitiesGenerator.getChromeOptions());
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notificatins");

        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String variable = "driver";
        System.out.println("Setting driver into context with variable name " + variable);
        context.setAttribute(variable, browser);

        loginPage = new LoginPage(browser);
        contactsPage = new ContactsPage(browser);
    }

    @AfterMethod(alwaysRun = true, description = "Closing browser")
    public void tearDown() {
        if (browser != null) {
            browser.quit();
        }
    }
}
