package TestNG;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Case2 {
	@BeforeSuite
public void configBeforeSuite()
{
		System.out.println("Execute Before Suite ");
}
	@BeforeClass
	public void configBeforeClass()
	{
		System.out.println("Execute Before class");
	}
	@BeforeMethod
	public void configBeforeMethod()
	{
		System.out.println("Execute Before Method");
	}
	@Test
	public void CreateContactTest()
	{
		System.out.println("Execute Create Contact");
	}
	@Test
	public void CreateContactWithPhoneNumber()
	{
		System.out.println("Execute CreateContactWithPhoneNumber");
	}
	@AfterMethod
	public void configAfterMethod() 
	{
		System.out.println("Execute After Method");
	}
	@AfterClass
	public void configBefore()
	{
		System.out.println("Execute After Class");
	}
	@AfterSuite
	public void configAfterSuite()
	{
		System.out.println("Execute After Suite");
	}
	}


