package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement male=driver.findElement(By.xpath("//label[text()='Male']/..//input[@id=\"gender-male\"]"));
		male.click();
		WebElement firstName=driver.findElement(By.id("FirstName"));
		firstName.sendKeys("Mohammed");
		WebElement LastName=driver.findElement(By.id("LastName"));
		LastName.sendKeys("Ansari");
		WebElement Email=driver.findElement(By.id("Email"));
		Email.sendKeys("surosh95@yahoo.com");
		WebElement password=driver.findElement(By.id("Password"));
		password.sendKeys("DFER345690");
		WebElement confirmpassword=driver.findElement(By.id("ConfirmPassword"));
		confirmpassword.sendKeys("DFER345690");
		driver.findElement(By.linkText("Register")).click();
		 }
	}
