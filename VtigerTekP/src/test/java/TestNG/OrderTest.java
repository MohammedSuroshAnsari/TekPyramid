package TestNG;

import org.testng.annotations.Test;

public class OrderTest {
	@Test
	public void CreateOrderTest() {
		System.out.println("Execute CreateOrderTest===123");
	}
	@Test(dependsOnMethods = "CreateOrderTest")
	public void billingAnOrderTest() {
		System.out.println("Execute billingAnOrderTest===123");
	}
	}

