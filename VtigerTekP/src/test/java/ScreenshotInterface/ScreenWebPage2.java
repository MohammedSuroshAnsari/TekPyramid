package ScreenshotInterface;

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

public class ScreenWebPage2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement searchField=driver.findElement(By.id("small-searchterms"));
		searchField.sendKeys(("laptop"));
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']")).click();
		WebElement add_to_cart=driver.findElement(By.id("add-to-cart-button-31"));
		add_to_cart.click();
		WebElement cart=driver.findElement(By.xpath("//span[text()='Shopping cart']"));
		cart.click();
		TakesScreenshot tks=(TakesScreenshot)driver;
		 File temp = tks.getScreenshotAs(OutputType.FILE);
		 File perm = new File("./Screenshot/Demoworkshop.png");
		FileHandler.copy(temp,perm);
		driver.quit();
	}

	}

