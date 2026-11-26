package TekPyramid;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.example.com");
		//Store parent window
		String parent=driver.getWindowHandle();
		//Get all window handles
		Set<String> windows=driver.getWindowHandles();
		//Switch between windows
		for(String window : windows) {
			if(!window.equals(parent)) {
				driver.switchTo().window(window);
			}
			}
		//Switch back to parent window
		driver.switchTo().window(parent);
		driver.quit();
		}
	}
