package TestNG;

import java.io.ObjectInputFilter.Status;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SampleReportTest {
	ExtentReports report;
	@BeforeSuite 
	//public void configBeforeSuite() {
		//ExtentSparkReporter spark=new ExtentSparkReporter("./AdvanceReport/report.html");
		//spark.config().setReportName("CRMReport");
		//spark.config().setTheme(Theme.STANDARD);
		//report=new ExtentReports();
		//report.attachReporter(spark);
		//report.setSystemInfo("browser","Chrome-121");
		@AfterSuite
		public void configAS() {
		}
		@Test
		public void createContactTest() {
			WebDriver driver=new ChromeDriver(); 
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://localhost:8888");
			TakesScreenshot ts=(TakesScreenshot)driver;
			String src=ts.getScreenshotAs(OutputType.BASE64);
			ExtentTest test=report.CreateTest("CreateContactTest1");
			//test.log(Status.INFO,"Login to App");
			//test.log(Status.INFO,"Navigate to contact page");
			//test.log(Status.INFO,"Create Contact");
			if("HDFbbbC".equals("HDgfFC")) {
				//test.log(Status.PASS,"Contact is created");
			}
			else {
				test.addScreenCaptureFromBase64String(src,"Errorfile");
			}
			report.flush();
			driver.close();
			}
			}
		
		
	