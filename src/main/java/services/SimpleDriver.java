package services;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleDriver {

    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\TAF\\src\\test\\resources\\chromedriver.exe");

   return new ChromeDriver();
    }
}
