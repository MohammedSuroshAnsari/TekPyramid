package TekPyramid;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTestReadDataFromRunTime {
 @Test
 public void runtimeparameterTest() {
	String URL=System.getProperty("url");
	String BROWSER=System.getProperty("browser");
	String USERNAME=System.getProperty("username");
	String PASSWORD=System.getProperty("password");
	}
}
