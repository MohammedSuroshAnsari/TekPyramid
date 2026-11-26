package TekPyramid;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenShadowRootElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[contains(text(),'Root')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[contains(text(),'Root')])[2]")).click();
		Thread.sleep(2000);
		//identify shadow host and used to search shadow root element and sending data to it.
		SearchContext ShadowRoot_un = driver.findElement(By.xpath("//form/div[1]")).getShadowRoot();
		ShadowRoot_un.findElement(By.cssSelector("input[type='text']")).sendKeys("tanuja");
		Thread.sleep(3000);
		//close browser
		driver.quit();
		}
	}
