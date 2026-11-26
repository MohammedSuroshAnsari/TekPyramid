package organizationTestScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class CreateOrgFetchingDataFromXML {
	@Test
	public void createOrg(XmlTest test) throws EncryptedDocumentException, IOException
	{
		WebDriver driver=null;
		String browser=test.getParameter("browser");
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}else if(browser.equals("edge"))
		{
		driver=new EdgeDriver();
		}else
		{
			System.out.println("Browser not specified correctly");
		}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(test.getParameter("url"));
	driver.findElement(By.name("user_Name")).sendKeys(test.getParameter("un"));
	driver.findElement(By.name("user_password")).sendKeys(test.getParameter("pwd"));
	driver.findElement(By.xpath("////input@id=\"submitButton\"]")).click();
	//generate random numbers
	Random random=new Random();
	int ranInt=random.nextInt(1000);
	driver.findElement(By.xpath("//a[text()='Organizations']")).click();
	//read test script data from excel
	FileInputStream fis1=new FileInputStream("C:\\Users\\User\\Desktop\\data\\testScriptData.xlsx");
	Workbook wb=WorkbookFactory.create(fis1);
	String orgname=wb.getSheet("org").getRow(1).getCell(2).toString()+ranInt;
	driver.findElement(By.xpath("//img[@alt=\"create Organization...\"]")).click();
	driver.findElement(By.name("accountname")).sendKeys(orgname);
	driver.findElement(By.xpath("//input[@class=\"crmbuttonsmall save\"]")).click();
	wb.close();
	}
	}
