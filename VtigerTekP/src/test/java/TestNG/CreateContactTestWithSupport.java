package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateContactTestWithSupport {
	@Test

	public void createContactWithSupportDates() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		try {
			//Launch application
			driver.get("http://yourapplication.com");
			//Login
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.id("login")).click();
			//Navigate to contacts
wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Contacts"))).click();
			//Click create Contact
			driver.findElement(By.id("createContact")).click();
			//Enter Last Name
			String lastName="Ansari";
			driver.findElement(By.name("lastName")).sendKeys("lastname");
			//Enter support start date
			String StartDate ="2026-11-24";
	WebElement startDateField=driver.findElement(By.name("supportStartDate"));
	startDateField.sendKeys(StartDate);
	//Enter support End Date
	String endDate="2027-11-24";
	WebElement endDateField=driver.findElement(By.name("SupportEndDate"));
	endDateField.sendKeys(endDate);
	//Click Save
	driver.findElement(By.id("save")).click();
	//Verify Contact Creation
	String actualLastName=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='" + lastName + "']"))).getText();
	Assert.assertEquals(actualLastName, lastName);
	System.out.println("Contact created successfully with support dates");
		} finally {
			driver.quit();
}
}
}
