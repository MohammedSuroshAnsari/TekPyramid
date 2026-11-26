package TekPyramid;

import org.testng.annotations.Test;

public class ContactTest1 {
	@Test
	public void createContactTest() {
		System.out.println("execute createContact with -->HDFC");
	}
	@Test(dependsOnMethods = "createContactTest")
	public void modifyContactTest() {
		System.out.println("execute query insert contact in DB==> ICICI");
		System.out.println("execute modifyContactTest-->ICICI=>ICICI-1");
	}
	@Test(dependsOnGroups = "modifyContactTest--HDFC")
	public void deleteContactTest() {
		System.out.println("execute query insert contact in DB==> UPI");
		System.out.println("execute deleteContactTest UPI");
	}
	}
