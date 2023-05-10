import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Optionsvalidation {
public WebDriver driver;
@Test
    public void options(){
    List<WebElement> allvalues=new Select(driver.findElement(By.id("day"))).getOptions();
    System.out.println("allvalues.get(5).getText()");
    for(int i=0; i<allvalues.size(); i++);
    System.out.println("allvalues.get(i).getText()");
    int i = 0;
    if (allvalues.get(i).getText().contains("21"));{
        System.out.println(allvalues.get(i).getText());
        System.out.println("passed 21");
    }
}
@BeforeTest
    public void beforetest(){
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.get("https://www.facebook.com/reg/?app_id=1140740696088074&logger_id");
    driver.manage().window().maximize();
}
@AfterTest
    public void aftertest(){
}
}
