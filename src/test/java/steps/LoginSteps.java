package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

import static org.testng.Assert.assertTrue;

public class LoginSteps {
    WebDriver driver;

    public LoginSteps(WebDriver driver) {
        this.driver = driver;
    }

    //login
    @Step("Login by user: {username}")
    public void login(String user, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login(user, password);
        assertTrue(new MainPage(driver).isPageOpened(), "Main page was not opened");
    }
}
