package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class ListenerImplementationImplementsITestListenerIsuiteListener {
	public static ExtentReports report;
	public static ExtentTest test;
	public void onStart(ITestContext context) {
		System.out.println("Report configuration");
	}
	public void onFinish(ITestContext context) {
		System.out.println("Report backup");
	}
	public void onTestStart(ITestResult result) {
		System.out.println("====="+result.getMethod().getMethodName()+"====");
	}
	public void onTestSuccess(ITestResult result) {
		try {
			String tsName=result.getMethod().getMethodName();
			TakesScreenshot ts=(TakesScreenshot) BaseClass.sdriver;//[driver]
			//Driver is present baseclass can't invoke the methods in baseclass because those are congig methods
			//and we can't make driver as static because it will not support in parallel execution]
			File src=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("./Screenshot/"+tsName+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void onTestSkipped(ITestResult result) {
	}
	}


