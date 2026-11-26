package TestNG;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Case1 {
	@BeforeSuite
	public void configBeforeSuite()
	{
		System.out.println("Execute BeforeSuite");
	}
	@BeforeClass
	public void configBefore()
	{
		System.out.println("Execute Before Class");
	}
	@BeforeMethod
	public void configBeforeMethod()
	{
		System.out.println("Execute Before Method");
	}
	@Test
	public void createContactTest()
	{
		System.out.println("Execute Create Contact");
	}
	@AfterMethod
	public void configAfterMethod()
	{
		System.out.println("Execute After Method");
	}
	@AfterClass
	public void configAfterClass()
	{
	System.out.println("Execute After Class");
	}
	@AfterSuite
	public void configAfterSuite()
	{
		System.out.println("Execute After Suite");
	}
	}

