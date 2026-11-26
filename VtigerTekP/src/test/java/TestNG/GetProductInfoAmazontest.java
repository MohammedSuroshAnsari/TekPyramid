package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GetProductInfoAmazontest {
	@Test(dataProvider = "getData")
	public void getProductInfo(String brandname, String ProductName) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		//Search product
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(brandname,Keys.ENTER);
		//Capture product info
		String x="//span[text()='"+ProductName+"']/../../../..//div[3]/div[1]/div/div[1]/div[1]/div[1]/a/span/span [2]/span[2]";
		System.out.println(driver.findElement(By.xpath(x)).getText());
	}
	@DataProvider
	public Object[][] getData(){
		Object[][]objArr=new Object[3][2];
		objArr[0][0]="Iphone";
		objArr[0][1]="Apple Iphone 15 (128 GB)-Black";
		objArr[1][0]="Iphone";
		objArr[1][1]="Apple Iphone 14 (128 GB)-Blue";
		objArr[2][0]="Iphone";
		objArr[2][1]="Apple Iphone 14 (128 GB)-Blue";
		return objArr;
		}
	}
