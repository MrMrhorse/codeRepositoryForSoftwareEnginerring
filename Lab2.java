package p1;
// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.Table.Cell;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
public class UntitledTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	//String driverPath = System.getProperty("user.dir") + "/src/geckodriver.exe";
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Machangwei\\Desktop\\st2020-master\\driver\\geckodriver.exe");
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    //driver.quit();
  }
  @Test
  public void untitled() throws Exception {
	  driver.get("http://103.120.226.190/selenium-demo/git-repo");
	  driver.manage().window().setSize(new Dimension(550, 692));
    //输入流读取excel文件
    FileInputStream f = new FileInputStream(new File(System.getProperty("user.dir")+"/src/Selenium+Lab2020.xlsx"));
    //获取整个excel
    XSSFWorkbook hb=new XSSFWorkbook(f);
    //System.out.println(hb.getNumCellStyles());
    //获取第一个表单sheet
    XSSFSheet sheet=hb.getSheetAt(0);
    //获取第一行的行数
    int firstrow=sheet.getFirstRowNum();
    int lastrow=20;
    System.out.println(firstrow+" "+lastrow);
    //循环行数依次获取列数
    for (int i = firstrow; i < 21; i++) {
    	//获取第i行
        Row row=sheet.getRow(i);
        org.apache.poi.ss.usermodel.Cell studentId=row.getCell(1);
        org.apache.poi.ss.usermodel.Cell password= row.getCell(2);
        System.out.println(studentId.toString()+" "+password.toString());
        driver.findElement(By.name("user_number")).click();
        driver.findElement(By.name("user_number")).sendKeys(studentId.toString());
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys(password.toString());
        driver.findElement(By.cssSelector(".btn")).click();
        driver.findElement(By.cssSelector(".col-xl-10")).click();
    }
   f.close();
  }
}
