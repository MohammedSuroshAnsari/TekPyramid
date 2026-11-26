package TekPyramid;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateContactTest1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//create object of class
		FileUtility flib=new FileUtility();
		ExcelUtility elib=new ExcelUtility();
		String browser=flib.getDataFromPropertiesFile("brwoser");
		//generate random number
		Random random=new Random();
		int ranInt=random.nextInt(1000);
		//read test scipt data from excel
		String contact=elib.getDataFromExcel("contact",1,2)+ranInt;
		WebDriver driver =null;
		if(browser.equals("Chrome"))
		{
			driver= new ChromeDriver();
		}
		else
			if(browser.equals("firefox")) {
				driver=new FirefoxDriver();
			}
			else if(browser.equals("edge"))
			{
				driver=new EdgeDriver();
			}else
			{
				driver=new ChromeDriver();
			}
		driver.get(flib.getDataFromPropertiesFile("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("user_name")).sendKeys(flib.getDataFromPropertiesFile("username"));
		driver.findElement(By.name("user_password")).sendKeys(flib.getDataFromPropertiesFile("password"));
		driver.findElement(By.xpath("//input[@id=\"SubmitButton\"]")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//img[@alt=\"Create Contact...\"]")).click();
		driver.findElement(By.name("lastname")).sendKeys(contact);
		driver.findElement(By.xpath("//input[@value=\" save \"]")).click();
		String headertext=driver.findElement(By.className("dvHeaderText")).getText();
		if(headertext.contains(contact))
		{
			System.out.println(contact+"is created");
		}else {
			System.out.println(contact+"is not created");
		}
		String actLastName=driver.findElement(By.id("dtview_LastName")).getText();
		if(actLastName.equals(contact))
		{
			System.out.println(contact+"is verified");
		}
		else {
			System.out.println(contact+"is not verified");
		}
		driver.close();
		}
		}


