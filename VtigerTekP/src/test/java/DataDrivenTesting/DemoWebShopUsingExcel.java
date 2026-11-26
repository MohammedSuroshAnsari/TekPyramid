package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopUsingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		FileInputStream fis=new FileInputStream("C:\\Users\\suros\\OneDrive\\Desktop\\DemoWorkbook1.xlsx");
		Workbook wb =WorkbookFactory.create(fis);
        Sheet sh=wb.getSheet("Registration");
		Row row=sh.getRow(0);
		Cell cell=row.getCell(1);
	    String FIRSTNAME=cell.getStringCellValue();
		Cell cell1=row.getCell(3);
		String LASTNAME=cell1.getStringCellValue();
		Cell cell2=row.getCell(5);
		String EMAIL =cell2.getStringCellValue();
        Cell cell3=row.getCell(7);
		String PASSWORD=cell3.getStringCellValue();
		wb.close();
		WebElement radio=driver.findElement(By.xpath("//label[text()='Male']/..//input[@id=\\\"gender-male\\\"]"));
		radio.click();
		driver.findElement(By.id("FirstName")).sendKeys(FIRSTNAME);
		driver.findElement(By.id("LastName")).sendKeys(LASTNAME);
		driver.findElement(By.id("Email")).sendKeys(EMAIL);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(PASSWORD);
		driver.findElement(By.id("register-button")).click();
		
		
	}
	}
