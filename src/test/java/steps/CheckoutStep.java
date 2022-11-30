package steps;

import baseEnteties.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.CheckoutPage;
import pages.MenuPage;

public class CheckoutStep extends BaseStep {
    CheckoutPage checkoutPage;
    MenuPage menuPage;

    public CheckoutStep(WebDriver driver) {
        super(driver);
        checkoutPage = new CheckoutPage(driver);
        menuPage = new MenuPage(driver);
    }

    public void goToContinueCheckout() {
        checkoutPage.clickButtonCheckout();
    }

    public void successfulCheckout(String firstName, String lastname, String zipCode) {
        checkoutPage.setFistName(firstName);
        checkoutPage.setLastName(lastname);
        checkoutPage.setLastZipCode(zipCode);
    }

    public void clickToFinishCheckout() {
        checkoutPage.clickContinue();
    }

    public void finishCheckout() {
        checkoutPage.clickButtonFinish();
    }
}
