package TekPyramid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://example.com");
		Select s=new Select(driver.findElement(By.id("dropdown")));
		s.selectByVisibleText("Java");
		s.selectByValue("Java");
		s.selectByIndex(1);
		driver.quit();
}
}
