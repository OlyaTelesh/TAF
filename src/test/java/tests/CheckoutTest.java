package tests;

import baseEnteties.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;

public class CheckoutTest extends BaseTest {
    public void successCheckoutTest() {
        loginStep.login(ReadProperties.username(), ReadProperties.password());
        menuStep.goToCheckoutPage();
        checkoutStep.goToContinueCheckout();
        checkoutStep.successfulCheckout(ReadProperties.firstNameOfUser(), ReadProperties.lastNameOfUser(), ReadProperties.zipCode());
        checkoutStep.clickToFinishCheckout();
        checkoutStep.finishCheckout();
        Assert.assertTrue(driver.getCurrentUrl().equals(ReadProperties.success ()));
    }

}
