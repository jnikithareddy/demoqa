import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;

public class TestXlsx {
    public WebDriver driver;
    @Test
    public void excelSheet()throws Exception{
        File src=new File("C:\\Users\\KLESA006\\Downloads\\Gamas.xlsx");
        FileInputStream finput=new FileInputStream(src);
        XSSFWorkbook workbook=new XSSFWorkbook(finput);
        XSSFSheet s=workbook.getSheetAt(0);
        String username=s.getRow(1).getCell(0).getStringCellValue();
        driver.findElement(By.id("login_field")).sendKeys(username);
        Thread.sleep(3000);
        String password=s.getRow(1).getCell(1).getStringCellValue();
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(4000);
    }

    @BeforeTest
    public void beforeTest()throws Exception{
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://github.com/login?return_to=%2Flogins");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @AfterTest
    public void afterTest(){
    }
}
