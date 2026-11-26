package TestNG;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CreateContactTest2 {
	@BeforeSuite
	public void configBeforeSuite()
	{
		System.out.println("Execute configBeforeSuite");
	}
	@BeforeClass
	public void ConfigBeforeClass()
	{
		System.out.println("Execute configBeforeClass");
	}
	@BeforeMethod
	public void configBeforeMethod()
	{
		System.out.println("Execute configBeforeMethod");
	}
	@Test
	public void CreateContact()
	{
		System.out.println("Execute CreateContact");
	}
	@Test
	public void CreateContactWithDate()
	{
		System.out.println("Execute CreateContactWithDate");
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
