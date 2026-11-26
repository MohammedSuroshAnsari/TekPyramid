package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollActionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement searchWebElement=driver.findElement(By.xpath("//a[text()='Search']"));
		 Actions act = new Actions(driver);
		 act.scrollToElement(searchWebElement).perform();
		 act.click(searchWebElement).perform();

	}

}
