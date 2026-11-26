package TekPyramid;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationTestingPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/2018/09/automation-form.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='blue']")).click();
		driver.findElement(By.xpath("//option[@value='cheetah']")).click();
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		driver.findElement(By.xpath("//a[@data-date='18']")).click();
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		driver.findElement(By.xpath("//a[@aria-current='false' and@date='24']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Start Date']")).sendKeys("27-06-2026");
		driver.findElement(By.xpath("//input[@placeholder='End Date']")).sendKeys("29-07-2026");
		driver.findElement(By.xpath("//button[@class='submit-btn']")).click();
		Thread.sleep(2000);
		//Wikipedia Web Element
		driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("newspaper");
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		Thread.sleep(2000);
		//Handling Alerts
		//Simple Alerts
		driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		Thread.sleep(2000);
		Alert ale=driver.switchTo().alert();
		ale.accept();
		//Confirmation Alert
		driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
		Alert ale1=driver.switchTo().alert();
		ale1.dismiss();
		//Prompt Alert
		driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
		Alert ale2=driver.switchTo().alert();
		System.out.println(ale2.getText());
		ale2.dismiss();
		//Actions Class
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		act.moveToElement(ele).build().perform();
		WebElement copy_text=driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		act.doubleClick(copy_text).build().perform();
		WebElement draggable=driver.findElement(By.id("draggable"));
		WebElement droppable=driver.findElement(By.id("droppable"));
		act.dragAndDrop(draggable, droppable).build().perform();
		Thread.sleep(2000);
		//Scrolling dropdown
		WebElement drop_down=driver.findElement(By.xpath("//input[@placeholder='Select an item']"));
		drop_down.click();
		WebElement move_to=driver.findElement(By.xpath("//div[@class='option'])[27]"));
		act.moveToElement(move_to).build().perform();
		move_to.click();
		}
	}
