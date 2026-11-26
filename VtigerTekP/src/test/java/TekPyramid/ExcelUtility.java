package TekPyramid;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String getDataFromExcel(String sheetname, int rowNum, int celNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./testdata/testscriptdata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data= wb.getSheet(sheetname).getRow(rowNum).getCell(celNum).getStringCellValue();
		return data;
	}
	public int getRowcount(String sheetName)throws Throwable {
		FileInputStream fis=new FileInputStream("./testdata/testscriptdata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int rowcount =wb.getSheet(sheetName).getLastRowNum();
		return rowcount;
		}
	public void setDataIntoExcel(String sheetName,int rowNum,int celNum, String data)throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./testdata/testscriptdata.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	wb.getSheet(sheetName).getRow(rowNum).createCell(celNum);
	FileOutputStream fos=new FileOutputStream("./testdata/testscriptdata.xlsx");
	wb.write(fos);
	wb.close();
	}
	public String readDataFromExcel(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}
	public String readDataFromExcel(String string, int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
	}
