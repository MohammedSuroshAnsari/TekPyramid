package TekPyramid;

import org.testng.annotations.Test;

public class OrderTest {
	@Test(invocationCount = 10)
	public void createOrderTest() {
		System.out.println("Execute createOrderTest==>123");
		String str=null;
		System.out.println(str.equals("123"));
	}
	@Test
	public void billingAnOrderTest() {
		System.out.println("Execute billingAnOrderTest==>123");
		}
	}
