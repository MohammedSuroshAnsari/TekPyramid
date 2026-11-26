package TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassB {
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
	}
