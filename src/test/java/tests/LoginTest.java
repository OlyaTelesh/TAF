package tests;

import baseEnteties.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MenuPage;
import steps.LoginStep;

import java.awt.*;

public class LoginTest extends BaseTest {
    @Test
    public void successLoginTest() {

        loginStep.login(ReadProperties.username(), ReadProperties.password());
        Assert.assertTrue(new MenuPage(driver).isPageOpened());
    }
    @Test
    public void incorrectUsernameTest() {
        // Используется неправильное имя пользователя
        loginStep.loginIncorrect(ReadProperties.usernameWrong(), ReadProperties.password());
        Assert.assertTrue(new MenuPage(driver).isPageOpened());

    }

    @Test
    public void incorrectPswTest() {

    }
}
