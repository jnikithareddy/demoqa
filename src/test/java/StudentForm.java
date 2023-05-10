import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StudentForm {
    public WebDriver driver;
    @Test
    public void fillingDetails()throws Exception {
        driver.findElement(By.id("firstName")).sendKeys("Nikitha");
        driver.findElement(By.id("lastName")).sendKeys("Reddy");
        driver.findElement(By.id("userEmail")).sendKeys("nikithareedy.j8@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
        driver.findElement(By.id("userNumber")).sendKeys("8106406612");
        driver.findElement(By.id("dateOfBirthInput")).click();
        new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"))).selectByVisibleText("April");
        new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"))).selectByVisibleText("1992");
        driver.findElement(By.cssSelector(".react-datepicker__day--017")).click();
        driver.findElement(By.id("subjectsInput")).sendKeys("Maths");
        driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
        //Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]")));
        driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]")).click();
        driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
        driver.findElement(By.id("currentAddress")).sendKeys("Mumbai");
        driver.findElement(By.id("currentAddress")).sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys("NCR");
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys("Noida");
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        driver.findElement(By.id("closeLargeModal")).click();
    }
    @BeforeTest
    public void beforeTest()throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
    }
    @AfterTest
    public void afterTest() {
    }
}
