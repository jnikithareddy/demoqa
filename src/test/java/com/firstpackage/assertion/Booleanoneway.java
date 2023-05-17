package com.firstpackage.assertion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Booleanoneway{
    public WebDriver driver;
    @Test
    public void options() {
        //Switching to Roundtrip
        driver.findElement(By.xpath("//button[contains(text(),'Round Trip')]")).click();
        //Thread.sleep(3000);
        boolean printConditon = driver.findElement(By.xpath("//button[contains(text(),'Round Trip')]")).isDisplayed();
        System.out.println(printConditon);
        WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'Round Trip')]"));
        if (ele.isEnabled())
        {
            System.out.println("Round trip is passed");
        }
        else
        {
            System.out.println("not available");
        }
    }
    @BeforeTest
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://savaari.com/");
        driver.manage().window().maximize();
    }
    @AfterTest
    public void afterTest(){
    }
}
