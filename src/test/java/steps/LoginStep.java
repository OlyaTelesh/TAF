package steps;

import baseEnteties.BasePage;
import baseEnteties.BaseStep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.MenuPage;
import pages.LoginPage;

public class LoginStep extends BaseStep {

    LoginPage loginPage;

    public LoginStep(WebDriver driver) {
        super(driver);
        loginPage = new LoginPage(driver);
    }

    public void login(String username, String psw) {
        loginPage.setUsername(username);
        loginPage.setPsw(psw);
        loginPage.clickLoginButton();
    }

    public LoginPage loginIncorrect(String username, String psw) {
        login(username, psw);
        return loginPage;
    }
}
