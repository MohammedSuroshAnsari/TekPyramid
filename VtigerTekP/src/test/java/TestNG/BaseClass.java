package TestNG;

import java.sql.SQLException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import TekPyramid.HomePage;
import TekPyramid.JavaUtility;
import TekPyramid.LoginPage;
import TekPyramid.WebDriverUtility;
import databaseUtility.DatabaseUtility;
import vtigerFileUtility.FileUtility;

public class BaseClass {

	public static TakesScreenshot sdriver;
	public DatabaseUtility dUtils=new DatabaseUtility();
	public FileUtility fUtils=new FileUtility();
	public ExcelUtility eUtils=new ExcelUtility();
	public WebDriverUtility wUtils=new WebDriverUtility();
	public JavaUtility jUtils=new JavaUtility();
	public WebDriver driver;
	public HomePage hp=new HomePage(driver);
	@BeforeSuite(alwaysRun=true)
	public void connectToDB() throws SQLException
	{
		dUtils.connectToDB();
		Reporter.log("--DB Connected--",true);
	}
	@Parameters("BROWSER")
	@BeforeClass(alwaysRun=true)
	public void launchBrowser()throws Throwable
	{
		String BROWSER=fUtils.readDataFromPropertyFile("browser");
		if(BROWSER.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
			Reporter.log("Launched chrome browser--",true);
		}
		else if(BROWSER.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(BROWSER.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		else {
			Reporter.log("--Invalid browser--",true);
		}
		wUtils.maximizeWindow(driver);
		wUtils.waitforpageload(driver, 20);
	}
	@BeforeMethod(alwaysRun=true)
	public void loginToApp() throws Throwable
	{
	String URL=fUtils.readDataFromPropertyFile("URL");
	String USERNAME=fUtils.readDataFromPropertyFile("USERNAME");
	String PASSWORD=fUtils.getDataFromPropertiesFile("PASSWORD");
	driver.get(URL);
	LoginPage lp=new LoginPage(driver);
	lp.loginToApp(USERNAME, PASSWORD);
	Reporter.log("--Loggen in to Appln--",true);
	}
	@AfterMethod(alwaysRun=true)
	public void logoutFromAppl()
	{
		hp.signOutOfApp(driver);
		Reporter.log("--Logged out from Appln--",true);
	}
	@AfterClass(alwaysRun=true)
	public void closeBrowser()
	{
		driver.quit();
		Reporter.log("--Close the browser--",true);
	}
	@AfterSuite(alwaysRun = true)
	public void closeDB() throws SQLException
	{
		dUtils.closeDB();
		Reporter.log("--Connected from DB--",true);
	}
	}
		
		
		
		
		
	
	
	

