package tests;

import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.BrowsersService;

public class Test8 {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new BrowsersService().getDriver();
        driver.get(ReadProperties.getUrl());
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void loginTest() {
        driver.get(ReadProperties.getUrl());
        driver.findElement(By.id("user-name")).sendKeys(ReadProperties.username());
        driver.findElement(By.id("password")).sendKeys(ReadProperties.password());
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector(".inventory_item_price")).getText(), "$29.99");
        Assert.assertEquals(driver.findElement(By.id("item_4_title_link")).getText(), "Sauce Labs Backpack");

        driver.findElement(By.id("remove-sauce-labs-backpack")); // поиск элемента по id
        driver.findElement(By.name("remove-sauce-labs-backpack"));// поиск элеимента по имени
        driver.findElement(By.className("cart_desc_label")); //поиск элемента по мени класса
        driver.findElement(By.tagName("div")); //поиск элемента по тэгу
        driver.findElement(By.linkText("DESCRIPTION")); //поиск элемента по linktext
        driver.findElement(By.partialLinkText("RIPTION")); //поиск элемента по partialLinkText


        driver.findElement(By.xpath("//*[@class='inventory_item_price']")); // Поиск по атрибуту, например By.xpath("//tag[@attribute='value']");
        driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));// Поиск по тексту, например By.xpath("//tag[text()='text']");
        driver.findElement(By.xpath("//*[contains(@name,'remove-')"));//Поиск по частичному совпадению атрибута, например By.xpath("//tag[contains(@attribute,'text')]");
        driver.findElement(By.xpath("//*[contains(text(),'DESCRIPTION')]")); //Поиск по частичному совпадению текста, например By.xpath("//tag[contains(text(),'text')]");
        driver.findElement(By.xpath("//*[@class='title']/ancestor::div")); //ancestor, например //*[text()='Enterprise Testing']//ancestor::div
        driver.findElement(By.xpath("//*[@class='btn btn_action btn_medium checkout_button' and @id='checkout']")); // поиск элемента с условием AND, например //input[@class='_2zrpKA _1dBPDZ' and @type='text']


        driver.findElement(By.cssSelector(".btn_action")).click();
        driver.findElement(By.cssSelector(".btn_action.btn_medium")).click();
        driver.findElement(By.cssSelector("#continue-shopping")).click();
        driver.findElement(By.cssSelector("div"));
        driver.findElement(By.cssSelector("div.page_wrapper"));
        driver.findElement(By.cssSelector("[style='position: absolute; left: 0px; top: 0px; z-index: 1; width: 100%; height: 100%; margin: 0px; padding: 0px; border: none; font-size: 0px; background: transparent; cursor: pointer;'"));
        driver.findElement(By.cssSelector("[data-test~='remove-sauce-labs-backpack'"));
        driver.findElement(By.cssSelector("[name |=remove-sauce-labs-backpack]"));
        driver.findElement(By.cssSelector("[name ^=r]"));
        driver.findElement(By.cssSelector("[name $=pack]"));
        driver.findElement(By.cssSelector("[name *=pack]"));














    }


   /* @Test
    public void basicLocatorsTest() {  //поиск по id
        driver.get("file:C:\\TAF\\src\\test\\resources\\index.html");
        Assert.assertTrue(driver.findElement(By.cssSelector("#my-Address")).isDisplayed());

        // Поиск по class name
        Assert.assertTrue(driver.findElement(By.cssSelector(".newsletter")).isDisplayed());

        // Поиск по нескольким значения в аттрибуте class
        Assert.assertTrue(driver.findElement(By.cssSelector(".noSel.newsletter")).isDisplayed());

        // Поиск по tag name
        Assert.assertTrue(driver.findElement(By.cssSelector("h1")).isDisplayed());

        //Поиск по tag и значению из аттрибута class
        Assert.assertTrue(driver.findElement(By.cssSelector("div.intro")).isDisplayed());

        // Поиск по классу с учетом иерархии
        Assert.assertEquals(2, driver.findElements(By.cssSelector("#Lastname .markup")).size());

        // Поиск всех элементов с тэгом h1 или p
        Assert.assertEquals(8, driver.findElements(By.cssSelector("h1, p")).size());

        // Поиск всех элементов с тэгом p которые идут сразу за элементом с тэго ul
        Assert.assertEquals(1, driver.findElements(By.cssSelector("ul + p")).size());

        // Поиск всех элементов с тэгом div которые являются братьями элементу с тэгом p
        Assert.assertEquals(2, driver.findElements(By.cssSelector("p ~ div")).size());

        // Поиск всех элементов у которых присутствует аттрибут title
        Assert.assertEquals(1, driver.findElements(By.cssSelector("[title]")).size());

        // Поиск всех элементов у которых присутствует аттрибут style с конкретным значением
        Assert.assertEquals(1, driver.findElements(By.cssSelector("[style='overflow: auto;']")).size());

        // Поиск всех элементов у которых присутствует аттрибут id со значением начинающимся на какое-то value-
        Assert.assertEquals(1, driver.findElements(By.cssSelector("[id|=my]")).size());

        // Поиск всех элементов у которых присутствует аттрибут id со значением заканчивающимся на какое-то value
        Assert.assertEquals(1, driver.findElements(By.cssSelector("[id$='ess']")).size());

        // Поиск всех элементов у которых присутствует аттрибут id со значением начинающимся на какое-то value
        Assert.assertEquals(2, driver.findElements(By.cssSelector("[id^=L]")).size());

        // Поиск всех элементов у которых присутствует аттрибут title со значением содержащим слово целиком
        Assert.assertEquals(1, driver.findElements(By.cssSelector("[title~=beautiful]")).size());

        // Поиск всех элементов у которых присутствует аттрибут title со значением содержащим какой текст
        Assert.assertEquals(1, driver.findElements(By.cssSelector("[title*=beaut]")).size());

        // Поиск всех disabled элементов
        Assert.assertEquals(1, driver.findElements(By.cssSelector(":disabled")).size());

        // Поиск всех enabled элементов
        Assert.assertEquals(8, driver.findElements(By.cssSelector(":enabled")).size());

        // Поиск всех выборанных элементов
        Assert.assertEquals(2, driver.findElements(By.cssSelector(":checked")).size());

        // Поиск всех элементов c пустым телом
        Assert.assertEquals(16, driver.findElements(By.cssSelector(":empty")).size());

        // Поиск элемента с тэгом p и которым является первым дочерним элементом
        Assert.assertEquals(1, driver.findElements(By.cssSelector("p:first-child")).size());

        // Поиск элемента с тэгом p и которым является последним дочерним элементом
        Assert.assertEquals(2, driver.findElements(By.cssSelector("p:last-child")).size());

        // Поиск элемента с тэгом p и которым является n-ым дочерним элементом
        Assert.assertEquals(1, driver.findElements(By.cssSelector("p:nth-child(2)")).size());
    }
*/
}