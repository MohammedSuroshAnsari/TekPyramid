package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sun.org.apache.bcel.internal.classfile.Method;

public class HomePageVerification {
	@Test
	public void HomepageTest(Method mtd) {
		System.out.println(mtd.getName()+"Test Start");
		String expTitle="Home page";
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).getText();
		driver.findElement(By.id("SubmitButton")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).getText();
		String ele = null;
		if(ele.trim().equals(expTitle)) {
			System.out.println("Home page is verified==pass");
		} else {
			System.out.println("Home page is not verified==fail");
		}
		driver.close();
	}
	@Test
	public void VerifyHomepageLogoTest(Method mtd) {
		System.out.println(mtd.getName()+ "Test Start");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin123");
		driver.findElement(By.id("submitButton")).click();
		boolean status=driver.findElement(By.xpath("//img[@title=\"vtiger-crmlogo.gif\"]")).isEnabled();
		if(status==true) {
			System.out.println("Logo is verified ==Pass");
		} else {
			System.out.println("Logo is not verified==Fail");
		}
		driver.close();
		System.out.println("Test end");
		}
	}
