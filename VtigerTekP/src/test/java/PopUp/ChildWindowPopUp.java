package PopUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://www.shoppersstack.com/sub-category/headphones/");
		WebElement laptop=driver.findElement(By.xpath("//span[text()='Apple AirPods (2nd Generation)']"));
laptop.click();
String mainid=driver.getWindowHandle();
WebElement i=driver.findElement(By.xpath("//button[@aria-label=\"compare\"]"));
i.click();
Set<String> childIds=driver.getWindowHandles();
childIds.remove(mainid);
for(String Ids:childIds) {
	driver.switchTo().window(Ids);
	driver.manage().window().maximize();
	driver.close();
}
System.out.println(mainid);
System.out.println(childIds);
}
}


