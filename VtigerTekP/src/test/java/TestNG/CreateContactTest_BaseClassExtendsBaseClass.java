package TestNG;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import TekPyramid.CreateNewOrganizationPage;
import TekPyramid.HomePage;
import TekPyramid.OrganizationInformationPage;

public class CreateContactTest_BaseClassExtendsBaseClass {
	private WebDriver driver;

	@Test(groups = {"RegressionTest","SmokeTest"})
	public void CreateOrGBaseClass()throws EncryptedDocumentException,IOException
	{
		HomePage hp=new HomePage(driver);
		hp.getOrgLink();
		OrganizationPage op=new OrganizationPage(driver);
		op.getCreateNewOrgBtn();
		CreateNewOrganizationPage cnop=new CreateNewOrganizationPage(driver);
		int orgName=elib.getDataFromExcel("org",1,2)+jlib.getRandomNumber();
		cnop.createOrg(orgName);
		OrganizationInformationPage oip=new OrganizationInformationPage(driver);
		String actOrgName=oip.getHeaderMsg();
		if(actOrgName.contains(actOrgName)) {
			System.out.println(orgName+"is verified and pass");
			System.out.println(orgName+"is not verified and fail");
		}
		}
	@Test(groups = "SmokeTest")
	public void CreateContact()throws EncryptedDocumentException,IOException{
		int ranInt=jlib.getRandomNumber();
		//read test script data from excel
		int contact=elib.getDataFromExcel("contact",1,2)+ranInt;
		HomePage hp=new HomePage(driver);
		hp.getContactLink();
		ContactPage cp=new ContactPage(driver);
		cp.getCreateNewConBtn();
		CreateNewContactPage cnp=new CreateNewContactPage(driver);
		cnp.getLastNameEdit();
		cnp.getSaveBtn();
		ContactInformationPage cip=new ContactInformationPage(driver);
		String headertext=cip.getHeaderTxt().getText();
		SoftAssert s=new SoftAssert();
		//s.assertEquals(headertext, contact);
		//if(headertext.contains(contact)) {
			//System.out.println(contact +"is created");
		//} else {
			//System.out.println(contact + "is not created");
		//}
		String actLastName=driver.findElement(By.id("dtlview_LastName")).getText();
		if(actLastName.equals(contact)) {
			System.out.println(contact + "is verified");
		} else {
			System.out.println(contact + "is not verified");
		}
		s.assertAll();
		}
		}
		
        
