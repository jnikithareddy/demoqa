package com.secondpackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frames {
    public WebDriver driver;
    public Actions action;
    @Test
    public void clickable()throws InterruptedException{
        //i frame
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
        WebElement DragFrom= driver.findElement(By.id("draggable"));
        WebElement DropTo=driver.findElement(By.id("droppable"));
        action=new Actions(driver);
        action.dragAndDrop(DragFrom,DropTo).build().perform();
        driver.switchTo().parentFrame();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Demos")).click();
    }
    @BeforeTest
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
    }
    @AfterTest
    public void afterTest(){
    }
}
