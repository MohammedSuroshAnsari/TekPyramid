package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement malebox= driver.findElement(By.id("gender-male"));
		malebox.click();
		WebElement Firstname= driver.findElement(By.id("FirstName"));
		Firstname.sendKeys("Mohammed");
		WebElement LastName= driver.findElement(By.id("LastName"));
		LastName.sendKeys("Ansari");
		WebElement Email= driver.findElement(By.id("Email"));
		Email.sendKeys("Surosh95@yahoo.com");
		WebElement pass= driver.findElement(By.id("password"));
		pass.sendKeys("4FSA!23GHI");
		WebElement confirmpass= driver.findElement(By.id("confirmpass"));
		confirmpass.sendKeys("4FSA!23GHI");
		driver.findElement(By.id("register-button")).click();
	}
}
		

	