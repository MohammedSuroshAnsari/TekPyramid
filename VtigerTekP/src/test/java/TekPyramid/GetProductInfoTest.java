package TekPyramid;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GetProductInfoTest {
	@Test(dataProvider = "getData")
	public void GetProductInfoTest(String brandName, String productName) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://amazon.in");
		//search product
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(brandName,Keys.ENTER);
		//capture product info
		String x="//span[text()='"+productName+"']/../../div[3]/div[1]/div/div[1]/a/span/span[2]/span[2]";
		String price=driver.findElement(By.xpath(x)).getText();
		System.out.println(price);
		driver.quit();
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] objArr=new Object[3][2];
		objArr [0][0]="iphone";
		objArr[0][1]="Apple Iphone 12(128 GB)-Black";
		objArr[0][1]="iphone";
		objArr[1][1]="Apple iphone 14 pro (1TB-Space Black";
		return objArr;
		}
	}
