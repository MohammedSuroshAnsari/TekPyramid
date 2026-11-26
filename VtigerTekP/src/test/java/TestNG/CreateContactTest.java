package TestNG;

import org.testng.annotations.Test;

public class CreateContactTest {
	@Test(priority = -1)
	public void CreateContactTest() {
		System.out.println("Execute CreateContactTest");
	}
	@Test(priority = 0)
	public void modifyContactTest() {
		System.out.println("Execute modifyContactTest");
	}
	@Test(priority = 3)
	public void deleteContactTest() {
		System.out.println("Execute deleteContactTest");
	}
	}
