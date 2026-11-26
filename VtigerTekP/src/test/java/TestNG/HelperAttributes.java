package TestNG;

import org.testng.annotations.Test;

public class HelperAttributes {
@Test(priority = 0)
public void CreateAccount() {
	System.out.println("Account Created");
}
@Test(priority = 1,dependsOnMethods ="CreateAccount")
public void editAccount() {
	System.out.println("Account Edited");
}
@Test(priority =2,dependsOnMethods = {"CreateAccount","editAccount"})
public void deleteAccount() {
	System.out.println("Account Deleted");
		}
}