package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.BrowsersService;

public class SmokeTest {
    private WebDriver driver;

    @BeforeMethod
    public void SetUp() {
        BrowsersService browsersService = new BrowsersService();
        driver = browsersService.getDriver();
    }

    @Test
    public void a_validateIKTCalculationTest() {
        driver.get("https://clinic-cvetkov.ru/company/kalkulyator-imt/");
        WebElement weight = driver.findElement(By.name("weight")); //находим элемент по значению имени и присваиваем weight
        WebElement height = driver.findElement(By.name("height"));//находим элемент по значению имени и присваиваем height
        WebElement button = driver.findElement(By.id("calc-mass-c"));//находим элемент по значению id и присваиваем button обозначаем кнопку

        height.sendKeys("183"); //вводим в строку рост заданное значение
        weight.sendKeys("58");//вводим в строку вес заданное значение
        button.click();//кликаем на кнопку

        WebElement result = driver.findElement(By.id("imt-result"));
        Assert.assertEquals(result.getText(), "17,3 - Недостаточная (дефицит) масса тела"); //сравниваем чтобы текст который ищем по айди совпадал с тексом который мы вводим

    }

    @Test
    public void validateSKF() throws InterruptedException {
        driver.get("http://13gp.by/informatsiya/meditsinskie-kalkulyatory/995-raschet-skorosti-klubochkovoj-filtratsii-skf");


        WebElement selectWebElement = driver.findElement(By.id("oSex"));
        Select selectSex = new Select(selectWebElement);
        selectSex.selectByIndex(1);
        Thread.sleep(2000);
        selectSex.selectByValue("0");
        Thread.sleep(2000);
        selectSex.selectByVisibleText("женский");
        Thread.sleep(2000);
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
