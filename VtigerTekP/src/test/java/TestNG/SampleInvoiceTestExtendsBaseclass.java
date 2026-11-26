package TestNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class SampleInvoiceTestExtendsBaseclass {
	@Test
	public void CreateInvoiceTest() {
		System.out.println("Execute CreateInvoiceTest");
		String acttitle=driver.getTitle();
		Assert.assertEquals(acttitle, "Login");
		System.out.println("Step-2");
		System.out.println("Step-3");
		System.out.println("Step-4");
}
}
