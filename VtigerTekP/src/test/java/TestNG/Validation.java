package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Validation {
	@Test
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
String ExpectedTitle="Demo Web Shop";
String ActualTitle=driver.getTitle();
Assert.assertEquals(ActualTitle,ExpectedTitle,"Navigation failed");
driver.findElement(By.linkText("Register")).click();
	}
	}
