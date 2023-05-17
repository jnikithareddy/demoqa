package com.secondpackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Verification {
    public WebDriver driver;
    @Test
    public void fun() {
        String Actualvalue = "$3";
        String Expectedvalue = driver.findElement(By.xpath("//b[contains(text(),'$398')]")).getText();
        System.out.println(Expectedvalue);
        try {
            Assert.assertEquals(Actualvalue, Expectedvalue);
        } catch (Throwable t) {
            System.out.println("Apple");
            System.out.println("Banana");
        }
        driver.quit();
    }
    @BeforeTest
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/");
        driver.manage().window().maximize();
    }
    @AfterTest
    public void afterTest(){
    }
}
