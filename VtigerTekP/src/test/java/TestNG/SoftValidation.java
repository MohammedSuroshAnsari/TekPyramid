package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftValidation {
	@Test
	public void Register() {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	String expectedUrl="https://demowebshop.tricentis.com/";
	String actualUrl=driver.getCurrentUrl();
//Soft assertion validation
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actualUrl,expectedUrl,"Something went wrong");
		driver.findElement(By.linkText("Register")).click();
		soft.assertAll();
		}
	
	
	
	}
