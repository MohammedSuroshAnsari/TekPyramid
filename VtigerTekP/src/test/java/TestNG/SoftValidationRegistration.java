package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftValidationRegistration {
	@Test
	public void Registration() {
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	
	driver.findElement(By.id("FirstName")).sendKeys("Mohammed");
	driver.findElement(By.id("LastName")).sendKeys("Ansari");
	driver.findElement(By.id("Email")).sendKeys("surosh98@yahoo.com");
	driver.findElement(By.id("Password")).sendKeys("DFT45632");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("DFT45632");
	driver.findElement(By.id("register-button")).click();
	
	
	String expectedUrl="https://demowebshop.tricentis.com/registerresult/1";
	String actualUrl=driver.getCurrentUrl();
	//Soft assertion validation
			SoftAssert soft=new SoftAssert();
			soft.assertEquals(actualUrl,expectedUrl,"Something went wrong");
soft.assertAll();
			}
}
