package TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassC {
	@BeforeMethod
	public void configBeforeMethod()
	{
		System.out.println("Execute BM");
	}
	@Test
	public void createContactTest()
	{
		System.out.println("Execute CreateContact");
	}
	@Test
	public void CreateContactWithPhoneNumberTest()
	{
		System.out.println("Execute CreateContactWithPhoneNumber");
	}
	}
