package ScreenshotInterface;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotOfWebElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://www.bmw.in/en/index.html");
	 WebElement logo = driver.findElement(By.xpath("//img[@title=\"BMW Logo\"]"));
	 File temp1 = logo.getScreenshotAs((OutputType.FILE));
	 File loc=new File("./Screenshot/logo.png");
	 FileHandler.copy(temp1, loc);
	 driver.quit();
	}

}
