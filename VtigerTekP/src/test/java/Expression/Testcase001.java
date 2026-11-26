package Expression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase001 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		search.sendKeys("Mobile");
		driver.findElement(By.cssSelector("input[value='Go']")).click();

	}

}
