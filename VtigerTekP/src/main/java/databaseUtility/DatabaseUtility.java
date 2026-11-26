package databaseUtility;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatabaseUtility {
	public void getDbconnection(String url, String username, String password)throws SQLException {
		try {
			WebDriver driver=new ChromeDriver();
		DriverManager.getConnection(url, username, password);
	}catch (Exception e) {
	}
	}
	public void executeConSelectQuery(String query) throws Throwable{
		Connection con = null;
		Statement stat = con.createStatement();
		Object result=null;
		try {
			Statement stat1= con.createStatement();
			result= stat1.executeUpdate(query);
		}catch (Exception e) {
		}
		return;
	}
	public void connectToDB() {
		// TODO Auto-generated method stub
		
	}
	public void closeDB() {
		// TODO Auto-generated method stub
		
	}
	}
