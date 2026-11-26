package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzer {
	@Test//(retryAnalyzer=com.crm.listenereUtility.RetryListenerlmp.class)
	public void ActivateSim() {
		System.out.println("ActivateSim Start");
		System.out.println("Step-1");
		String acttitle=driver.getTitle();
		Assert.assertEquals(acttitle,"Login");
		System.out.println("Step-2");
		System.out.println("Step-3");
		System.out.println("Step-4");
	}
	}
