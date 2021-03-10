package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    //er.viktoria1919-ck6r@force.com
    //Hipstr19
    String login = "er.viktoria1919-ck6r@force.com";
    String password = "Hipstr19";
    String URL = "https://teachmeskillsqa.my.salesforce.com";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login() {
        driver.get(URL);
        driver.findElement(By.id("username")).sendKeys(login);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("Login")).click();
    }
}
