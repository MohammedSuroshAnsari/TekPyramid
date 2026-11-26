package TekPyramid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosedShadowRootElement {

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
		driver.findElement(By.xpath("//a[contains(text(),'close')]")).click();
		Thread.sleep(2000);
		//locating the nearest element and performing actions
		driver.findElement(By.xpath("//h1[text()='Login']")).click();
		driver.quit();
		}
	}
