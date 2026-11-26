package TekPyramid;

import javax.management.ObjectName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreateOrgAndDeleteOrg {
	@Test
	public void CreateAndDeleteOrg() throws Throwable {
		FileUtility flib=new FileUtility();
		ExcelUtility elib=new ExcelUtility();
		WebDriverUtility wlib=new WebDriverUtility();
		JavaUtility jlib=new JavaUtility();
		String browser=flib.getDataFromPropertiesFile("browser");
		WebDriver driver=null;
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		} else
			if(browser.equals("edge")) {
				driver=new EdgeDriver();
			}else if(browser.equals("firefox")) {
				driver=new FirefoxDriver();
			}else {
				System.out.println("Browser is not specified properly");
			}
		driver.manage().window().maximize();
		wlib.waitforpageload(driver, 0);
		driver.get(flib.getDataFromPropertiesFile("url"));
		LoginPage Ip=new LoginPage(driver);
		Ip.loginToApp(flib.getDataFromPropertiesFile("username"), browser);
		flib.getDataFromPropertiesFile("password");
		HomePage hp=new HomePage(driver);
		hp.clickOnOrgLnk();
		OrganizationPage op=new OrganizationPage(driver);
		op.getCreateNewOrgBtn();
		CreateNewOrganizationPage cnop=new CreateNewOrganizationPage(driver);
		op.getCreateNewOrgBtn();
		String orgName=elib.getDataFromExcel("org", 10,2)+jlib.getRandomNumber();
		cnop.createOrg(orgName);
		OrganizationInformationPage oip=new OrganizationInformationPage(driver);
		String actorgName=oip.getHeaderMsg();
		if(actorgName.contains(orgName)) {
			System.out.println(orgName+"is verified and pass");
		}
		else {
			System.out.println(orgName+"is not verified and fail");
		}
		hp.clickOnOrgLnk();
		//op.getSearchEdit().sendkeys(orgName);
		String value=elib.getDataFromExcel("org",10,3);
		wlib.selectValue(op.getSearchDD(),value);
		driver.findElement(By.xpath("//a[text()='"+orgName+"']/../..td[8]/a[text()='del']")).click();
		wlib.switchToAlertAccept(driver);
		hp.signOut();
		driver.quit();
	}
	}
		
		
	
