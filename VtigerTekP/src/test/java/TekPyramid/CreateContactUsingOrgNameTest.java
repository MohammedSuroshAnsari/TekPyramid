package TekPyramid;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CreateContactUsingOrgNameTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		Random ran=new Random();
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\commondata.properties");
	Properties pObj=new Properties();
	pObj.load(fis);
	//Get data from property file
	String BROWSER=pObj.getProperty("browser");
	String URL=pObj.getProperty("url");
	String USERNAME=pObj.getProperty("username");
	String PASSWORD=pObj.getProperty("password");
	//Get data from Testdata
	FileInputStream fi=new FileInputStream(".\\src\\test\\resources\\TestData55.xlsx");
	Workbook wb=WorkbookFactory.create(fi);
	Sheet sh=wb.getSheet("Organization");
	String random = null;
	//Get Org data from excel
	String OrgName=sh.getRow(0).getCell(1).getStringCellValue()+random;
	String Website=sh.getRow(1).getCell(1).getStringCellValue();
	String Symbol=sh.getRow(2).getCell(1).getStringCellValue();
	String PhoneNo=sh.getRow(3).getCell(1).getStringCellValue();
	String InDD=sh.getRow(1).getCell(3).getStringCellValue();
	String TypeDD=sh.getRow(1).getCell(4).getStringCellValue();
	//Get contacts from excel
	String lastname=wb.getSheet("Contacts").getRow(0).getCell(1).getStringCellValue();
	String title=wb.getSheet("Contacts").getRow(1).getCell(1).getStringCellValue();
	String dept=wb.getSheet("Contacts").getRow(2).getCell(1).getStringCellValue();
	String email=wb.getSheet("Contacts").getRow(3).getCell(1).getStringCellValue();
	String leadSource=wb.getSheet("Contacts").getRow(1).getCell(3).getStringCellValue();
	//Launch Browser
	if(BROWSER.equalsIgnoreCase("Chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(BROWSER.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else
	{
		System.out.println("--invalid browser--");
	}
	//maximize window
	driver.manage().window().maximize();
	//Enter Url
	driver.get(URL);
	//Wait for page load
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	// Login to app
	driver.findElement(By.name("User_name")).sendKeys(USERNAME);
	driver.findElement(By.name("User_password")).sendKeys(PASSWORD);
	driver.findElement(By.id("SubmitButton")).click();
	//Click on Organization link
	driver.findElement(By.linkText("Organization")).click();
	//Click on CreateOrgLookUp img
	driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	//Enter all the fields
	driver.findElement(By.name("accountname")).sendKeys(OrgName);
	driver.findElement(By.name("Website")).sendKeys(Website);
	driver.findElement(By.name("tickersymbol")).sendKeys(Symbol);
	driver.findElement(By.name("Phone")).sendKeys(PhoneNo);
	WebElement induDDEle=driver.findElement(By.xpath("//select[@name='industry']"));
	WebElement typeDDEle=driver.findElement(By.xpath("//select[@name='accountype']"));
	//handle industry dropdown
	Select sel=new Select(induDDEle);
	sel.selectByVisibleText(TypeDD);
	driver.findElement(By.xpath("//input[@title='save[Alt+S]']")).click();
	Thread.sleep(3000);
	System.out.println("--Organization created Suceesfully--");
	//navigate to contact link
	driver.findElement(By.linkText("Contacts")).click();
	//click on CreateContactLookUplmg
	driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
	//Enter all the fields with valid data
	driver.findElement(By.name("lastname")).sendKeys(lastname);
	driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
	//Switch from parent to child window
	Set<String>Window=driver.getWindowHandles();
	Iterator<String>it=Window.iterator();
	while(it.hasNext())
	{
		String win=it.next();
		String chilWin=driver.switchTo().window(win).getTitle();
		if(chilWin.contains("Accounts&action"))
		{
			break;
		}
	}
	//search for existing Org and click
	driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys(OrgName);
	driver.findElement(By.id("search_txt")).click();
	driver.findElement(By.xpath("//a[text()='"+OrgName+"']")).click();
	//switch from child to parent window
	Set<String>Wind=driver.getWindowHandles();
	Iterator<String>i=Wind.iterator();
	while(i.hasNext())
	{
		String wi=i.next();
		String parWin=driver.switchTo().window(wi).getTitle();
		if(parWin.contains("Contacts&action"))
		{
			break;
		}
	}
	driver.findElement(By.name("title")).sendKeys(title);
	driver.findElement(By.name("department")).sendKeys(dept);
	driver.findElement(By.name("email")).sendKeys(email);
	WebElement LeadSourceDD=driver.findElement(By.xpath("//select[@name='leadsource']"));
	//handle leadsource dropdown
	Select s=new Select(LeadSourceDD);
	s.selectByVisibleText(leadSource);
	driver.findElement(By.xpath("//input@title='save[Alt+S]']")).click();
	System.out.println("--Contacts created--");
	//sighout from appl
	driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
	WebElement signout=driver.findElement(By.linkText("Sign out"));
	Actions act=new Actions(driver);
	act.click(signout).perform();
	driver.quit();
	}
	}
	
	


