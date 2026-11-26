package TestNG;

import org.testng.annotations.Test;

public class CreateContactTest1 {
	@Test
	public void CreateContactTest() {
		System.out.println("Execute CreateContactTest-->HDFC");
	}
	@Test(dependsOnMethods = "CreateContactTest")
	public void modifyContactTest() {
		System.out.println("Execute modifyContactTest-->HDFC-->ICICI");
	}
	@Test(dependsOnMethods = "modifyContactTest")
	public void deleteContactTest() {
		System.out.println("Execute deleteContactTest-->ICICI");
		}
	}
