package POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//pre conditions
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   //object creation for pomclass
		HomePagePomClass hp=new HomePagePomClass(driver);
		//steps to fetch data from external files
		//Testscript
		driver.get("https://demowebshop.tricentis.com/");
		WebElement registerLink=hp.getRegisterLink();
		registerLink.click();
		FileInputStream fis=new FileInputStream("C:\\Users\\suros\\Desktop\\common data");
		Properties pobj=new Properties();
		pobj.load(fis);
		String URL=pobj.getProperty("Url");
		String FirstName=pobj.getProperty("FirstName");
		String LastName=pobj.getProperty("LastName");
		String Email=pobj.getProperty("Email");
		String Password=pobj.getProperty("Password");
		WebElement firstName=hp.getFirstName();
		firstName.sendKeys(FirstName);
		WebElement LastName1 = hp.getLastName();
		LastName1.sendKeys(LastName);
		WebElement Email1=hp.getEmail();
		Email1.sendKeys(Email);
		WebElement Password1=hp.getPassword();
		Password1.sendKeys(Password);
		WebElement ConfirmPassword=hp.getConfirmPassword();
		ConfirmPassword.sendKeys(Password);
}
}
