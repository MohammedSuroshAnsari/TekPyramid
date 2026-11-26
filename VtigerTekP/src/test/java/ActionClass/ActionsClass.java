package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://demowebshop.tricentis.com/");
		//actions class
		 Actions act = new Actions(driver);
		 act.contextClick().perform();
		 //click method
		 WebElement reglink=driver.findElement(By.linkText("Register"));
		 act.click(reglink);
		 }
	}
