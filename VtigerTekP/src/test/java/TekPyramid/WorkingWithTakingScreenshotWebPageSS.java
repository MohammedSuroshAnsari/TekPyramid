package TekPyramid;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithTakingScreenshotWebPageSS {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		//Launch the application
		driver.get("https://demowebshop.tricentis.com/");
		//Login to the account
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("Email")).sendKeys("surosh95@yahoo.com");
		WebElement ele=driver.findElement(By.id("password"));
		Select sel=new Select(ele);
		driver.findElement(By.id("password")).sendKeys("surosh95@yahoo.com");
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		//TakeScreenshot obj
		TakesScreenshot tss=(TakesScreenshot)driver;
		Thread.sleep(3000);
		//Taking the screenshot
		File ss=tss.getScreenshotAs(OutputType.FILE);
		//Location to store file
		File location=new File("./screenshot/AddingprdToCart.png");
		//Copying the screenshot to file
		FileHandler.copy(ss, location);
		//Close browser
		driver.quit();
		}
	}
