package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoginPage extends BasePage {
    //er.viktoria1919-ck6r@force.com
    //Hipstr19


    public static final By USER_NAME = By.id("username");
    public static final By PASSWORD = By.id("password");
    public static final By LOGIN_BUTTON = By.id("Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("Opening login page")
    public void open() {
        driver.get(URL);
    }

    @Step("Login by user {username}")
    public void login(String username, String password) {
        driver.findElement(USER_NAME).sendKeys(username);
        driver.findElement(PASSWORD).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
    }

    public void waitForLoginPage() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='All Pipeline - Current Year]")));
        } catch (Exception ex) {
            Assert.fail("ContatsPage was not opened");
        }
    }
}
