package TestNG;

import org.testng.ITestResult;

public class RetryImpClassimplementsIRetryAnalzer {
	int count=0;
	int retrycount=3;
	public boolean retry(ITestResult result) {
		if(count<retrycount)
		{
			count++;
			return true;
		}
		return false;
	}
	}

