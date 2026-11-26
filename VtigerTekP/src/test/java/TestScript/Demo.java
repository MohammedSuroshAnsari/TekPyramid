package TestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.HomePagePomClass1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomePagePomClass1 hp=new HomePagePomClass1();
		//pre-condition
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement registerLink=hp.getRegisterLink1();
		registerLink.click();

	}

}
