package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		 Actions act = new Actions(driver);
		 WebElement Drag=driver.findElement(By.id("draggable"));
		 WebElement Drop=driver.findElement(By.id("droppable"));
		 act.dragAndDrop(Drag, Drop).perform();
		 //point DropLoc=Drop.getLocation();
		 //System.out.println(DropLoc);
		 //act.dragandDropBy(Drag,18,292).perform();
		 }
	}
