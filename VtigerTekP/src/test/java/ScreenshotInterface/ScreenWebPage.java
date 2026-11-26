package ScreenshotInterface;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenWebPage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://www.bmw.in/en/index.html");
		//take screenshot of webpage
		TakesScreenshot tks=(TakesScreenshot)driver;
		File temp = tks.getScreenshotAs(OutputType.FILE);
		 File perman=new File("./Screenshot/picture.png");
		FileHandler.copy(temp, perman);
		}
	}
