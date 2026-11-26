package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePomClass {
	WebDriver driver;
	public HomePagePomClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public HomePagePomClass() {
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//input[@name=\"FirstName\"]")
	private WebElement FirstName;
	@FindBy(xpath="//input[@name=\"LastName\"]")
	private WebElement LastName;
	@FindBy(xpath="//input[@name=\"Email\"]")
	private WebElement Email;
	@FindBy(xpath="//input[@name=\"Password\"]")
	private WebElement Password;
	@FindBy(xpath="//input[@name=\"ConfirmPassword\"]")
	private WebElement ConfirmPassword;
	@FindBy(linkText="Register")
	private WebElement registerLink;
	public WebElement getLastName() {
		return LastName;
	}
	public void setLastName(WebElement lastName) {
		LastName = lastName;
	}
	public WebElement getEmail() {
		return Email;
	}
	public void setEmail(WebElement email) {
		Email = email;
	}
	public WebElement getPassword() {
		return Password;
	}
	public void setPassword(WebElement password) {
		Password = password;
	}
	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}
	public void setConfirmPassword(WebElement confirmPassword) {
		ConfirmPassword = confirmPassword;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void setFirstName(WebElement firstName) {
		FirstName = firstName;
	}
	@FindBy(xpath="//a[@href=\"/login\"]")
	private WebElement loginLink;
	@FindBy(xpath="//a[@href=\"/cart\"]")
	private WebElement cartLink;
	@FindBy(xpath="//a[@href=\"/wishlist\"]")
	private WebElement wishLink;
	public WebElement getRegisterLink11() {
		return registerLink;
	}
	public WebElement getLoginLink() {
		return loginLink;
	}
	public WebElement getCartLink() {
		return cartLink;
	}
	public WebElement getWishLink() {
		return wishLink;
		
	}
	public WebElement getRegisterLink1() {
		// TODO Auto-generated method stub
		return null;
	}
	public WebElement getRegisterLink() {
		// 

		return null;
	}
	public WebElement getRegisterLink2() {
		// TODO Auto-generated method stub
		return null;
	}
	public WebElement getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}
	}
