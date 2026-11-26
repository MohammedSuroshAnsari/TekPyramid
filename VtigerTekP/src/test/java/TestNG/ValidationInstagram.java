package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidationInstagram {
	@Test
	public void login() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		driver.findElement(By.xpath("//span[text()='Forgot password?']")).click();
		Thread.sleep(2000);
		String expectedUrl = "https://www.instagram.com/accounts/password/reset/?hl=en";
String actualUrl=driver.getCurrentUrl();
Assert.assertEquals(actualUrl,expectedUrl,"Navigation failed");
System.out.println("validation is passed");
  }
	}
