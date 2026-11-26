package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlowOfTestNG {
	
	@Test
	public void m1() {
		Reporter.log("Execution from m1",true);
		}
	@Test
	public void m2() {
		Reporter.log("Execution from m2",true);
	}
	@Test
	public void a() {
		Reporter.log("Execution from a",true);
	}
		@Test(priority = -2)
		public void b() {
			Reporter.log("Ansari Don't talk",true);
	}
		@Test(priority = -3,invocationCount=3)
		public void c() {
			Reporter.log("Only Execute");
		}
			@Test(invocationCount=5,threadPoolSize=2)
			public void m7() {
			
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.spacex.com/");
			}
			@Test(enabled=true)
			public void skip() {
				System.out.println("Skip Method");
			}
			}

