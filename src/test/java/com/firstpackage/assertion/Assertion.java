package com.firstpackage.assertion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertion {
    public WebDriver driver;

    @Test
    public void check() {
        //Correct title is "Welcome: Mercury Tours"
        //We taking title as "Mercury Tours" to make the test fail
        String expectedTitle = "Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertNotEquals(expectedTitle, actualTitle);
        driver.quit();
    }

    @BeforeTest
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/");
        driver.manage().window().maximize();
    }
    @AfterTest
    public void afterTest() {
    }
}

