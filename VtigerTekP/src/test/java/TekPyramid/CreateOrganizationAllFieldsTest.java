package TekPyramid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import organizationTestScripts.PropertyFileUtility;
import vtigerWebDriverUtility.JavaUtility;

public class CreateOrganizationAllFieldsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropertyFileUtility pLib=new PropertyFileUtility();
		JavaUtility jLib=new JavaUtility();
		ExcelUtility eLib=new ExcelUtility();
		WebDriverUtility wLib=new WebDriverUtility();
		/*Step1: read all neccessary data*/
		String BROWSER=pLib.readDataFromPropertyFile("browser");
		String URL=pLib.readDataFromPropertyFile("url");
		String USERNAME=pLib.readDataFromPropertyFile("username");
		String PASSWORD=pLib.readDataFromPropertyFile("password");
		String OrgName=eLib.readDataFromExcel("Contacts",4,2)+"_"+jLib.getRandomNumber();
		/*Step2:Launch the browser*/
		WebDriver driver=null;
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver(); 
		}
		else {
			System.out.println("Invalid browser");
		}
		wLib.maximizeWindow(driver);
		wLib.waitforpageload(driver, 0);
		driver.get(URL);
		/*Step3: Login to application*/
		LoginPage lp=new LoginPage(driver);
		lp.loginToApp(USERNAME, PASSWORD);
		//Step4: Navigate to Organization link
		HomePage hp=new HomePage(driver);
		hp.clickOnOrgLnk();
		//Step5: click on create org link
		OrganizationPage op=new OrganizationPage(driver);
		((OrganizationPage) op).clickOnCreateOrglmg();
		//Step6:enter mandatory fields
		CreateOrganizationPage cop=new CreateOrganizationPage();
		cop.createNewOrg(OrgName);
		//Step7: verification
		OrganizationPage oip=new OrganizationPage(driver);
		String actOrgName=oip.OrgNameInfo();
		if(actOrgName.contains(OrgName))
		{
			System.out.println(actOrgName+"--->data verified");
		}
		else
		{
			System.out.println("data invalid");
		}
		//logout
		hp.signOutOfApp(driver);
		//close the browser
		driver.quit();
		}
		}


