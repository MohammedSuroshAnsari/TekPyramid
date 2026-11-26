package TekPyramid;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//Capture screenshot
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//Destination path
		File dest=new File("C:\\Screenshots\\image.png");
		//Copy screenshot
		FileUtils.copyFile(src, dest);
		driver.quit();
		}
	}
