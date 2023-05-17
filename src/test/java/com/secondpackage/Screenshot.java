package com.secondpackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

public class Screenshot {
    public WebDriver driver;
    @Test
    public void alertscreen()throws Exception{
        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(3000);
        String str=driver.switchTo().alert().getText();
        System.out.println(str);
        driver.switchTo().alert().accept();
        String ATM="page1screen";
        File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        org.openqa.selenium.io.FileHandler.copy(scrFile,new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\"+ATM+".png"));
    }
    @BeforeTest
    public  void beforeTest()throws Exception{
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        String ATM="lobo2";
        File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        org.openqa.selenium.io.FileHandler.copy(scrFile,new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\"+ATM+".png"));
    }
    @AfterTest
    public void afterTest()throws Exception{
    }
}
