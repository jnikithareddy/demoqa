import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alerts {
    public WebDriver driver;
    @Test
    public void handlingAlerts() throws Exception{
        driver.findElement(By.id("alertButton")).click();
        String str=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
    }
    @BeforeTest
    public void openurl() throws Exception{
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(3000);
        driver.manage().window().maximize();
    }
    @AfterTest
    public void aftertest(){
    }
}
