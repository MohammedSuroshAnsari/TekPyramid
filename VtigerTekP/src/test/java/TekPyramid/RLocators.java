package TekPyramid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.browserstack.com/");
WebElement getStartedFree=driver.findElement(By.cssSelector("a#signupModalButton"));
WebElement getADemo=driver.findElement(RelativeLocator.with(By.tagName("button")).toRightOf(getStartedFree));
getADemo.click();
driver.get("https://www.browserstack.com/");
driver.manage().window().maximize();
WebElement getADemoo=driver.findElement(By.xpath("//button[contains(@class,'btn-secondary')and text()='Get a demo']"));
WebElement getStartedFreee=driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(getADemoo));
getStartedFreee.click();
driver.get("https://www,browserstack.com/");
WebElement freeTrial=driver.findElement(By.xpath("//ul[@id='primary-menu']//a[@id='free-trial-link-anchor']"));
WebElement search=driver.findElement((RelativeLocator.with(By.tagName("button")).near(freeTrial)));
search.click();
}
}
