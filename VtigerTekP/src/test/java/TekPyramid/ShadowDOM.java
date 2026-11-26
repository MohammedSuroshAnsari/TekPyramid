package TekPyramid;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://example.com");
		//Locate Shadow Host
		WebElement ShadowHost=driver.findElement(By.cssSelector("#shadow-host"));
		//Access Shadow Root
		SearchContext shadowRoot=ShadowHost.getShadowRoot();
		//Locate element inside Shadow DOM
		WebElement element=shadowRoot.findElement(By.cssSelector("#username"));
		//Perform action
		element.sendKeys("Selenium");
		driver.quit();
}
}
