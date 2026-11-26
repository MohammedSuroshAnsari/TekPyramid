package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/selenium/web/formpage.html");
		//steps to handle Dropdown
		WebElement dropdown=driver.findElement(By.name("selectomatic"));
		
		Select sel=new Select(dropdown);
		sel.selectByValue("still learning how to count,apparently");
		Thread.sleep(2000);
		sel.selectByIndex(1);
		//get option()
		WebElement dropdown2=driver.findElement(By.id("multi"));
		Select sel2=new Select(dropdown2);
		List<WebElement>options=sel2.getOptions();
		System.out.println(options);
		for(WebElement option:options) {
		System.out.println(option.getText());
}
	//deSelect methods
	sel2.deselectByIndex(0);
	Thread.sleep(1000);
	sel2.deselectByValue("sausages");
	Thread.sleep(1000);
	sel2.selectByVisibleText("onion gravy");
	//select all options
	sel.selectByValue("eggs");
	Thread.sleep(2000);
	sel.selectByVisibleText("Ham");
	Thread.sleep(2000);
	sel.selectByIndex(2);
	Thread.sleep(2000);
	sel.selectByVisibleText("onion gravy");
	Thread.sleep(2000);
	//selected options print
	System.out.println("-----selected options-----");
	List<WebElement> selectedopt=sel.getAllSelectedOptions();
	for(WebElement selopt:selectedopt) {
		System.out.println(selopt.getText());
	}
	//first selected option
	System.out.println("first selected option:"+sel.getFirstSelectedOption().getText());
	//De-select All
	sel.deselectAll();
	//is multiple Dropdown?
	System.out.println("Is Dropdown multiple select?:"+sel.isMultiple());
	Thread.sleep(2000);
	driver.quit();
	}
}



