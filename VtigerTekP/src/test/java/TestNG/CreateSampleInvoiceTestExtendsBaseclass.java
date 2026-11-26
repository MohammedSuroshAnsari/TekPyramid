package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateSampleInvoiceTestExtendsBaseclass {
	@Test
	public void CreateInvoiceTest() {
		System.out.println("Execute CreateInvoiceTest");
		String acttitle=driver.getTitle();
		Assert.assertEquals(acttitle,"Login");
		//[Hard assert, this assertEquals()generate an exception called AssertError]
		System.out.println("Step-1");
		System.out.println("Step-2");
		System.out.println("Step-3");
		System.out.println("Step-4");
	}
	@Test
	public void CreateInvoiceWithContactTest() {
		System.out.println("Execute CreateInvoiceWithContactTest");
		System.out.println("Step-1");
		String acttitle=driver.getTitle();
		Assert.assertEquals(acttitle,"Login");
		System.out.println("Step-2");
		System.out.println("Step-3");
		System.out.println("Step-4");
	}
	}