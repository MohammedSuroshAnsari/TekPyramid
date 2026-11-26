package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement searchfield= driver.findElement(By.xpath("//input[@valiue='search store']"));
		searchfield.sendKeys("books");
		WebElement searchBtn=driver.findElement(By.xpath("//input[@value='search']"));
		searchBtn.click();
		
		}
	}
