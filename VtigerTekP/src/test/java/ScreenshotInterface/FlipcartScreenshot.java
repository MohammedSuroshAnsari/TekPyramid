package ScreenshotInterface;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FlipcartScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://www.flipkart.com/");
		List<WebElement> Icons = driver.findElements(By.xpath("//div[contains(@class,\"css-g5y9jx r-1awozwy r-1777fci r-6gpygo r-iphfwy \")]"));
		for (WebElement icon : Icons) {
			String name = icon.getText();
			Thread.sleep(5000);
			File temp=icon.getScreenshotAs(OutputType.FILE);
			Thread.sleep(5000);
			File loc=new File("./Screenshot/"+name+".png");
			Thread.sleep(5000);
			FileHandler.copy(temp, loc);
			Thread.sleep(5000);
		}
		driver.quit();
		}
		}


