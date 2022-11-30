package pages;

import baseEnteties.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage extends BasePage {
    private final static String pagePath = "/inventory.html";
    private final By headerTitleLabelLocator = By.xpath("//span[contains(text(), 'Products')]");

    private final By twitterClick = By.linkText("Twitter");
    private final By facebookClick = By.linkText("Facebook");
    private final By linkdinClick = By.linkText("LinkedIn");

    private final By shoppingCartLink = By.className("shopping_cart_link");

    // Блок инициализации страницы
    public MenuPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getTwitterClick() {
        return driver.findElement(twitterClick);
    }

    public void twitterClick() {
        getTwitterClick().click();
    }

    public WebElement getFacebookClick() {
        return driver.findElement(facebookClick);
    }

    public void facebookClick() {
        getFacebookClick().click();
    }

    public WebElement getLinkInClick() {
        return driver.findElement(linkdinClick);
    }

    public void linkedInClick() {
        getLinkInClick().click();
    }

    public WebElement getshoppingCartLink() {
        return driver.findElement(shoppingCartLink);
    }
        public void shoppingCartLinkClick() {
            getshoppingCartLink().click();
        }

    @Override
    protected By getPageIdentifier() {
        return null;
    }
}
