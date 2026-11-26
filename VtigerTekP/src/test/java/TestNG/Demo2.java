package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo2 {
	@Test(groups = "Smoke testing")
	public void payment() {
		Reporter.log("payment",true);
	}
	@Test(groups = "Smoke Testing")
	public void list() {
		Reporter.log("Product list",true);
	}
	@BeforeSuite
	public void bs() {
		Reporter.log("Connect to DB",true);
	}
	@AfterSuite
	public void as() {
		Reporter.log("Disconnect to DB",true);
	}
}
