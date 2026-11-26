package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassC1 {
	@BeforeMethod
	public void configBeforeMethod()
	{
		System.out.println("Execute BM");
	}
	@AfterMethod
	public void configBeforeMethod1()
	{
		System.out.println("Execute AfterMethod");
	}
	@Test
	public void CreateContactTest()
	{
		System.out.println("Execute CreateCotact");
	}
	@Test
	public void CreateContactWithPhoneNumberTest()
	{
		System.out.println("Execute CreateContactWithPhoneNumber");
		}
	}
