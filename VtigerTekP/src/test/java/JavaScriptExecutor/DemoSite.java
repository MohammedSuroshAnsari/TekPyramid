package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoSite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		WebElement input=driver.findElement(By.name("custId"));
		Actions act=new Actions(driver);
		act.sendKeys(input, "654376").perform();
		WebElement submit=driver.findElement(By.name("submit"));
		act.moveToElement(submit).click().perform();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
		}
	}

