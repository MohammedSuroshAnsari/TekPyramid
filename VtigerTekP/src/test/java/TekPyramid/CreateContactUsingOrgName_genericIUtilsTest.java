package TekPyramid;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import vtigerWebDriverUtility.JavaUtility;

public class CreateContactUsingOrgName_genericIUtilsTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		FileUtility fUtil=new FileUtility();
		ExcelUtility eUtil=new ExcelUtility();
		JavaUtility jUtil=new JavaUtility();
		WebDriverUtility wUtil=new WebDriverUtility();
		DatabaseUtility dUtil=new DatabaseUtility();
		//Get data from property file
		String BROWSER=fUtil.readDataFromPropertyFile("browser");
		String URL=fUtil.readDataFromPropertyFile("url");
		String USERNAME=fUtil.readDataFromPropertyFile("username");
		String PASSWORD=fUtil.readDataFromPropertyFile("password");
		//Get data from test data
		String OrgName=eUtil.readDataFromExcel("Organization",0, 0);
		String Website=eUtil.readDataFromExcel("Organization",1);
		String Symbol=eUtil.readDataFromExcel("Organization",2, 0);
		String PhoneNo=eUtil.readDataFromExcel("Organization",3,1);
		String IndDD=eUtil.readDataFromExcel("Organization",1,3);
		String TypeDD=eUtil.getDataFromExcel("Organization",1,4);
		//Get Contacts data from excel
		String lastName=eUtil.readDataFromExcel("Contacts",0,1);
		String title=eUtil.readDataFromExcel("Contacts",1,1);
		String dept=eUtil.readDataFromExcel("Contacts",2,1);
		String email=eUtil.readDataFromExcel("Contacts",3,1);
		String leadSource=eUtil.readDataFromExcel("Contacts",1,3);
		//Launch browser
		if(BROWSER.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else 
		{
			System.out.println("invalid browser--");
		}
		//maximize window
		wUtil.maximizeWindow(driver);
		//Enter URL
		driver.get(URL);
		//wait for page load
		wUtil.waitforpageload(driver,20);
		//Login to app
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("SubmitButton")).click();
		//Click on Organization link
		driver.findElement(By.linkText("Organization")).click();
		//Click on CreateOrgLookUp lmg
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		//Enter all the fields
		driver.findElement(By.name("accountname")).sendKeys(OrgName);
		driver.findElement(By.name("website")).sendKeys(Website);
		driver.findElement(By.name("tickersymbol")).sendKeys(Symbol);
		driver.findElement(By.name("phone")).sendKeys(PhoneNo);
		WebElement induDDEle=driver.findElement(By.xpath("//select[@name='industry']"));
		WebElement typeDDEle=driver.findElement(By.xpath("//select[@name='accounttype']"));
		//handle industry dropdown
		wUtil.handleDropdown(induDDEle, IndDD);
		wUtil.handleDropdown(typeDDEle, TypeDD);
		driver.findElement(By.xpath("//input[@title='Save[Alt+S']")).click();
		Thread.sleep(3000);
		System.out.println("--Organization created successfully--");
		//Navigate to contact link
		driver.findElement(By.linkText("Contacts")).click();
		//Click on CreateContactLookuplmg
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		//Enter all the fields with valid data
		driver.findElement(By.name("lastname")).sendKeys(lastName);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
		//Switch from parent to child window
		wUtil.switchToWindow(driver,"Accounts&action");
		//search for existing Org and click
		driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys(OrgName);
		driver.findElement(By.id("search_txt")).click();
		driver.findElement(By.xpath("//a[text()='"+OrgName+"']")).click();
		//Switch from child to parent window
		wUtil.switchToWindow(driver,"Contacts&actions");
		driver.findElement(By.name("title")).sendKeys(title);
		driver.findElement(By.name("department")).sendKeys(dept);
		driver.findElement(By.name("email")).sendKeys(email);
		WebElement LeadSourceDD=driver.findElement(By.xpath("//select[@name='leadsource']"));
		//Handle leadsource dropdown
		wUtil.handleDropdown(leadSource, LeadSourceDD);
		driver.findElement(By.xpath("//input[@title='Save[Alt+S]']")).click();
		System.out.println("--Contacts Created--");
		//SignOut from application
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		WebElement signout=driver.findElement(By.linkText("Sign Out"));
		wUtil.mousehover(driver, signout);
		driver.quit();
		}
		}
		
		
		
			
		
		
		

	