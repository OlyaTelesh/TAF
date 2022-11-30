package tests;

import baseEnteties.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MenuPage;

public class MenuTest extends BaseTest {

    @Test
    public void clickOnTwitterTest() {
        loginStep.login(ReadProperties.username(), ReadProperties.password());
        menuStep.сlickOnTwiter();
        Assert.assertTrue(driver.getCurrentUrl().equals(ReadProperties.twiter()));
    }

    @Test
    public void clickOnFacebookTest() {
        loginStep.login(ReadProperties.username(), ReadProperties.password());
        menuStep.сlickOnFacebook();
    }

    /*@Test
    public void clickOnLinkInTest() {
        loginStep.login(ReadProperties.username(), ReadProperties.password());
        menuStep.clickOnLlinkIn();
    }*/

}
