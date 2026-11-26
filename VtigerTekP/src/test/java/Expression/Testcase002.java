package Expression;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase002 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.cssSelector("input[name='email']"));
		email.sendKeys("surosh95@yahoo.com");
		WebElement pass = driver.findElement(By.cssSelector("input[type='password']"));
		pass.sendKeys("TRFG156SDC");
		
		
	}

}
