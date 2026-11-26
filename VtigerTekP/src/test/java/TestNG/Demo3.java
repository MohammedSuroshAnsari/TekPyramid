package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo3 {
	@Test(groups = "Performance testing")
	public void payment() {
		Reporter.log("payment",true);
	}
	@Test(groups = "Performance Testing")
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
