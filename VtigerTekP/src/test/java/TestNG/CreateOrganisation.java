package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateOrganisation {
	@Test
	public void createOrganisationTest() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch application
		driver.get("http://yourapplication.com");
		//Login
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.id("login")).click();
		//Click on Organisations
		driver.findElement(By.linkText("Organisations")).click();
		//Click on Create Organisation
		driver.findElement(By.id("createOrganisation")).click();
		//Enter Organisation Name
		String orgName="OpenAI Technologies";
		driver.findElement(By.name("OrganisationName")).sendKeys(orgName);
		//Enter phone number
		String phone="9864169943";
		driver.findElement(By.name("phone")).sendKeys(phone);
		//Click on Save
		driver.findElement(By.id("save")).click();
		// verify organisation created
		String actualText=driver.findElement(By.xpath("//*[contains(text(),'"+orgName+"')]")).getText();
		Assert.assertTrue(actualText.contains(orgName),"Organisation is not created successfully");
		System.out.println("Organisation created successfully");
		driver.quit();
	}
	}
