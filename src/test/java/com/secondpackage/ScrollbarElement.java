package com.secondpackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.text.Element;
import java.util.concurrent.TimeUnit;

public class ScrollbarElement {
    public WebDriver driver;
    @Test
    public void scrollflow(){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement ele=driver.findElement(By.linkText("Linux"));
        js.executeScript("arguments[0].scrollIntoView();",ele);
    }
    @BeforeTest
    public void beforeTest() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/guru99home/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
@AfterTest
    public void afterTest(){
    }
}
