package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ImplementationofAnnotation {
	@BeforeSuite
	public void bs() {
		Reporter.log("Connect to DB",true);
	}
	@AfterSuite
	public void as() {
		Reporter.log("Disconnect to DB",true);
	}
	@BeforeClass
	public void bc() {
		Reporter.log("Launch the browser",true);
	}
	@AfterClass
	public void ac() {
		Reporter.log("Close the browser",true);
	}
	@BeforeMethod
	public void bm() {
		Reporter.log("Login the Application",true);
	}
	@AfterMethod
	public void am() {
		Reporter.log("Logout the Application",true);
	}
	@Test(groups = "Regression testing")
	public void payment() {
		Reporter.log("payment",true);
	}
	@Test(groups = "Regression Testing")
	public void list() {
		Reporter.log("Product list",true);
	}
	}
	


