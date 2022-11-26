package pages;

import baseEnteties.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    private final By pageIndetificator = By.id("checkout");
    private final By inputForFirstname = By.id("first-name");
    private final By inputForLastname = By.id("last-name");
    private final By inputForZipcode = By.id("postal-code");
    private final By clickForContinue = By.id("continue");
    private final By clickForFinish = By.id("finish");


    public WebElement buttonCheckout() {
        return driver.findElement(pageIndetificator);
    }

    public void clickButtonCheckout() {
        buttonCheckout().click();
    }

    public WebElement getInputForFirstname() {
        return driver.findElement(inputForFirstname);
    }

    public WebElement getInputForLastname() {
        return driver.findElement(inputForLastname);
    }

    public WebElement getInputForZipcode() {
        return driver.findElement(inputForZipcode);
    }

    public void setFistName(String value) {
        getInputForFirstname().sendKeys(value);
    }

    public void setLastName(String value) {
        getInputForLastname().sendKeys(value);
    }

    public void setLastZipCode(String value) {
        getInputForZipcode().sendKeys(value);
    }

    public WebElement getClickContinue() {
        return driver.findElement(clickForContinue);
    }

    public void clickContinue() {
        getClickContinue().click();
    }

    public WebElement getButtonFinish() {
        return driver.findElement(clickForFinish);

    }

    public void clickButtonFinish() {
        getButtonFinish().click();
    }

    @Override
    protected By getPageIdentifier() {
        return null;
    }

}

