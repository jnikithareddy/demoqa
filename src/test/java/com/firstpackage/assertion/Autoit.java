package com.firstpackage.assertion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Autoit {

    public WebDriver driver;

    @Test
    public void image()throws Exception{
     WebElement ele=driver.findElement(By.xpath("//input[@id='uploadPicture']"));
     ele.sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Lighthouse.jpg");
     Thread.sleep(4000);
    }

    @BeforeTest
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterTest
    public void afterTest(){
    }
}
