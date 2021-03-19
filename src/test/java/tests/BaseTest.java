package tests;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import steps.ContactSteps;
import steps.LoginSteps;
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
    LoginSteps loginSteps;
    ContactSteps contactSteps;
    ChromeOptions options = new ChromeOptions();

    @BeforeMethod(description = "Opening browser")
    public void setup(ITestContext context) {
        browser = new ChromeDriver(CapabilitiesGenerator.getChromeOptions());
        context.setAttribute("driver", browser);
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String variable = "driver";
        System.out.println("Setting driver into context with variable name " + variable);
        context.setAttribute(variable, browser);
        loginSteps = new LoginSteps(browser);
        contactSteps = new ContactSteps(browser);
    }

    @AfterMethod(alwaysRun = true, description = "Closing browser")
    public void tearDown() {
        if (browser != null) {
            browser.quit();
        }
    }
}