package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateContactIntegrationTest {
@Test
public void createContactWithExistingOrganisation() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	try {
		//Launch application
		driver.get("http://yourapplication.com");
		// Login
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.id("login")).click();
		//Navigate to contacts
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Contacts"))).click();
		//Click create Contact
		driver.findElement(By.id("createContact")).click();
		//Enter Last Name
		String lastName="Ansari";
		driver.findElement(By.id("organisationLookup")).click();
		//Select Existing Organisation 
		String orgName="OpenAI Technologies";
		driver.findElement(By.xpath("//a[text()='" + orgName + "']")).click();
		//Click save
		driver.findElement(By.id("save")).click();
		//Verify Contact Creation
		String actualLastName=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='"+ lastName + "']"))).getText();
		Assert.assertEquals(actualLastName, lastName);
		System.out.println("Contact created successfully with existing organisation");
	} finally {
		driver.quit();
		}
	}
}

