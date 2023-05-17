package com.secondpackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.SeleniumServerStandaloneManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Firstselectedoption {
    public WebDriver driver;

    @Test
    public void options() throws Exception {
        WebElement ele=new Select(driver.findElement(By.id("day"))).getFirstSelectedOption();
        System.out.println(ele.getText());
        if (ele.getText().equalsIgnoreCase("28"))
        {
            System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }
    }
    @BeforeTest
    public void openUrl() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/reg/?app_id=1140740696088074&logger_id");
        driver.manage().window().maximize();
    }
    @AfterTest
    public void afterText(){
    }
}