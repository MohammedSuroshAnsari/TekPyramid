package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataFromProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//step 1:Create object fileinputstream
		FileInputStream fis=new FileInputStream("./src/main/resources/Demo.properties");
		//Step 2: Create object for file type
		Properties pObj=new Properties();
		//Step 3: Load the file 
		pObj.load(fis);
		//Step 4: Fetch the data from file
		String URL=pObj.getProperty("url");
		String FIRSTNAME=pObj.getProperty("firstname");
		System.out.println("Url:"+URL);
		System.out.println("FirstName:"+FIRSTNAME);
		}
	}
