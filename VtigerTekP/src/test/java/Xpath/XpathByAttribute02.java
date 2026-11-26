package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement Mail = driver.findElement(By.xpath("//input[@name='Email']"));
	Mail.sendKeys("123@gmail.com");
	WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys("GFD156#fd");
	}
}
	
	
	



