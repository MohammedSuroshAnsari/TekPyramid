package TestNG;

import java.sql.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ListenerImplementationsImplementsITestListenerIsuiteListener {
	public static ExtentReports report;
	public static ExtentTest test;
	public void onStart(ISuite suite) {
		System.out.println("Report Configuration");
		String time=new Date(0).toString().replace("","_").replace(":","_");
		ExtentSparkReporter spark=new ExtentSparkReporter("./AdvanceReport/report"+time+".html");
		spark.config().setDocumentTitle("CRM Test Suite Result");
		spark.config().setReportName("CRMReport");
		spark.config().setTheme(Theme.STANDARD);
		//add Environment information and Create test
		report=new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS","Windows10");
		report.setSystemInfo("browser","Chrome-121");
	}
	public void onFinish(ISuite suite) {
		System.out.println("report backup");
		report.flush();
	}
	public void onTestStart(ITestResult result) {
		System.out.println("====" + result.getMethod().getMethodName()+"====");
		test=report.CreateTest(result.getMethod().getMethodName());
		UtilityClassObject.setTest(test);
		test.log(Status.INFO,result.getMethod().getMethodName()+"====>STARTED<======");
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("====="+ result.getMethod().getMethodName()+"==End==");
		test.log(Status.PASS,result.getMethod().getMethodName()+"===>Completed<====");
	}
	public void onTestFailure(ITestResult result) {
		String tsName=result.getMethod().getMethodName();
		TakesScreenshot ts=(TakesScreenshot) BaseClass.sdriver;//[driver]
		//Driver is present baseclass can't invoke the methods in baseclass because those are congig methods
		//and we can't make driver as static because it will not support in parallel execution]
		String src=ts.getScreenshotAs(OutputType.BASE64);
		String time=new Date(0).toString().replace("","_").replace(":","_");
		test.addScreenCaptureFromBase64String(src,tsName+"_"+ time);
		test.log(Status.FAIL,result.getMethod().getMethodName()+"====>Failed<======");
	}
	public void onStart(ITestContext context) {
	}
	public void onFinish(ITestContext context) {
	}
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP,result.getMethod().getMethodName()+"====>Skipped<======");
}
}
