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
    private final By linkdimClick = By.linkText("LinkedIn");

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
        return driver.findElement(linkdimClick);
    }

    public void linkedInClick() {
        getLinkInClick().click();
    }

    @Override
    protected By getPageIdentifier() {
        return null;
    }
}
