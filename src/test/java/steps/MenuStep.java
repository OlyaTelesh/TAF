package steps;

import baseEnteties.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.MenuPage;

public class MenuStep extends BaseStep {

    MenuPage menuPage;


    public MenuStep(WebDriver driver) {
        super(driver);
        menuPage = new MenuPage(driver);

    }

    public void сlickOnTwiter() {
        menuPage.twitterClick();
    }

    public void сlickOnFacebook() {
        menuPage.facebookClick();

        /*public void сlickOnLinkIn(){
            menuPage.linkedInClick();*/
    }

    public void goToCheckoutPage() {
        menuPage.shoppingCartLinkClick();
    }
}