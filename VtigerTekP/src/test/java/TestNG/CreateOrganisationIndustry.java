package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateOrganisationIndustry {
	private String actualText;

	@Test
	public void CreateOrganisationTest() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch application 
		driver.get("http://yourapplication.com");
		//Login
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.id("CreateOrganisation")).click();
		//Click organisations
		driver.findElement(By.linkText("Organisations")).click();
		//Click Create Organisation
		driver.findElement(By.id("CreateOrganisation")).click();
		//Enter Organisation name
		String orgName="Dell Technologies";
		driver.findElement(By.name("OrganisationName")).sendKeys(orgName);
		//Select Industry
		 WebElement industryDropdown=driver.findElement(By.name("Industry"));
		 Select s=new Select(industryDropdown);
		 s.selectByVisibleText("Technology");
		 //Click save
driver.findElement(By.xpath("//*[contains(text(),'"+orgName+"')]")).getText();
 Assert.assertTrue(actualText.contains(orgName),"Organisation is not created");
System.out.println("Organisation created successfully");
driver.quit();
 }
}
