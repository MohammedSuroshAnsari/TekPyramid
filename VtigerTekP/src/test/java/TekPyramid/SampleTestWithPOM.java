package TekPyramid;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class SampleTestWithPOM {
@FindBy(name="user_name")
WebElement ele1;
@FindBy(name="user_password")
WebElement ele2;
@FindBy(id="submitButton")
WebElement ele3;
@Test
public void sampleTest() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://localhost:8888");
	ele1.sendKeys("admin");
	ele2.sendKeys("admin");
	ele3.click();
	}
}
