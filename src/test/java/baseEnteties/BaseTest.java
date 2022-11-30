package baseEnteties;

import configuration.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.MenuPage;
import services.BrowsersService;
import steps.CheckoutStep;
import steps.LoginStep;
import steps.MenuStep;

public class BaseTest {
    protected WebDriver driver;
    protected LoginStep loginStep;
    protected CheckoutStep checkoutStep;

    protected MenuStep menuStep;


    @BeforeMethod
    public void setUp() {
        driver = new BrowsersService().getDriver();
        driver.get(ReadProperties.getUrl());

        loginStep = new LoginStep(driver);
        checkoutStep = new CheckoutStep(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
