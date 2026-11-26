package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
WebElement experience=driver.findElement(By.xpath("//p[text()='I have work experience (excluding internships)']"));
experience.click();
WebElement UploadResume=driver.findElement(By.id("resumeupload"));
UploadResume.sendKeys("C:\\Users\\suros\\Desktop\\Surosh's cv.pdf");
	}
}
