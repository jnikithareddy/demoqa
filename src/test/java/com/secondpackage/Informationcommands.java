package com.secondpackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Informationcommands {
    public WebDriver driver;
            @Test(priority = 1)
                public void gmail()throws Exception{
                String str1=driver.findElement(By.linkText("Gmail")).getText();
                System.out.println(str1);
            }
            @Test(priority = 2)
                public void google_image()throws Exception{
                String str2=driver.findElement(By.xpath("/html/body/div[1]/div[1]")).getAttribute("alt");
                System.out.println(str2);
            }
            @Test(priority = 3)
                public void searchbutton()throws Exception{
                String str3=driver.findElement(By.id("APjFqb")).getAttribute("value");
                System.out.println(str3);
            }
            @BeforeTest
    public void beforeTest(){
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                driver.get("http://google.com");
                driver.manage().window().maximize();
            }
            @AfterTest
    public void afterTest(){
            }

}
