package tests;

import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.BrowsersService;

public class homework1Test {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new BrowsersService().getDriver(); //однимет нужеый браузер, проициализурует и даст значение переменной драйвер

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void gpCalculatorTest() {
        driver.get(ReadProperties.getUrl());


        Select select = new Select(driver.findElement(By.id("oSex")));
        select.selectByIndex(1);

        driver.findElement(By.id("oCr")).sendKeys("80");
        driver.findElement(By.id("oAge")).sendKeys("38");
        driver.findElement(By.name("nWeight")).sendKeys("55");
        driver.findElement(By.name("nHeight")).sendKeys("163");
        driver.findElement(By.cssSelector("#Form1 > ul > li:nth-child(6) > input[type=button]:nth-child(1)")).click();
    }

    @Test
    public void anotherTest() {
        driver.get(ReadProperties.getUrl());
        WebElement mdrdResult = driver.findElement(By.id("txtMDRD"));
        Assert.assertEquals(mdrdResult.getText(), "MDRD: 74 (мл/мин/1,73кв.м)", "wrong, actual result is MDRD: NaN (мл/мин/1,73кв.м)");

        WebElement xbpResult = driver.findElement(By.id("txtMDRD1"));
        Assert.assertEquals(xbpResult.getText(), "ХБП: 2 стадия (при наличии почечного повреждения)", "wrong, actual result is ХБП (стадия)");

        WebElement gaultResult = driver.findElement(By.id("txtCG"));
        Assert.assertEquals(gaultResult.getText(), "Cockroft-Gault: 70 (мл/мин)", "wrong, actual result is Cockroft-Gault: NaN (мл/мин)");

        WebElement bodeSurfaceResult = driver.findElement(By.id("txtBSA"));
        Assert.assertEquals(bodeSurfaceResult.getText(), "Поверхность тела:1.58 (кв.м)", "wrong, actual result is Поверхность тела:NaN (кв.м)");
    }

    @Test
    public void homeworkTest2() {
        driver.get("https://kermi-fko.ru/raschety/Calc-Rehau-Solelec.aspx");
        driver.findElement(By.id("el_f_width")).sendKeys("10");
        driver.findElement(By.id("el_f_lenght")).sendKeys("10");
        Select selectType = new Select(driver.findElement(By.id("room_type")));
        selectType.selectByIndex(2);
        Select selectType1 = new Select(driver.findElement(By.id("heating_type")));
        selectType1.selectByIndex(2);
        driver.findElement(By.id("el_f_losses")).sendKeys("220");
        driver.findElement(By.cssSelector("#hf_calc > input")).click();

        WebElement powerOfCable = driver.findElement(By.id("floor_cable_power"));
        Assert.assertEquals(powerOfCable.getAttribute("value"), "122");

        WebElement floorCablePower = driver.findElement(By.id("spec_floor_cable_power"));
        Assert.assertEquals(floorCablePower.getAttribute("value"), "1");

    }

    @Test
    public void dificultTest() {
        driver.get("https://calc.by/building-calculators/laminate.html");
        driver.findElement(By.id("ln_room_id")).clear();
        driver.findElement(By.id("ln_room_id")).sendKeys("500");

        driver.findElement(By.id("wd_room_id")).clear();
        driver.findElement(By.id("wd_room_id")).sendKeys("400");

        driver.findElement(By.id("ln_lam_id")).clear();
        driver.findElement(By.id("ln_lam_id")).sendKeys("2000");

        driver.findElement(By.id("wd_lam_id")).clear();
        driver.findElement(By.id("wd_lam_id")).sendKeys("200");

        Select layingMethod = new Select(driver.findElement(By.id("laying_method_laminate")));
        layingMethod.selectByVisibleText("со смещение на 1/2 длины");

        driver.findElement(By.className("calc-btn")).click();

        Assert.assertEquals(driver.findElement(By.cssSelector("[style='padding:5px 0;font-size:18px; color:#0E8C19; font-weight:bold;']")).getText(),"7");
        Assert.assertEquals(driver.findElement(By.cssSelector("[style='padding:5px 0;font-size:22px; color:#C80303; font-weight:bold;']")).getText(), "53");



    }
}


