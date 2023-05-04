import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class MouseOverActions{
    public WebDriver driver;
    public Actions action;
    @Test
    public void mouseOver() throws Exception{
        WebElement ele1=driver.findElement(By.linkText("SwitchTo"));
        action.moveToElement(ele1).build().perform();
    }
    @BeforeTest
    public void openUrl() throws Exception{
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
    }
    @AfterTest
    public void afterTest(){
    }
}
