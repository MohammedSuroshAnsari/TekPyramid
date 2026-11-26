package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\suros\\Desktop\\DemoWorkbook.xlsx");
		//step 2: Open workbook
		Workbook wb =WorkbookFactory.create(fis);
		//step 3
		Sheet sh=wb.getSheet("Registration");
		//step 4
		Row row=sh.getRow(0);
		//step 5
		Cell cell=row.getCell(1);
		//step 6
		String FIRSTNAME=cell.getStringCellValue();
		Cell cell1=row.getCell(3);
		wb.close();
		System.out.println(FIRSTNAME);
			}
	}
