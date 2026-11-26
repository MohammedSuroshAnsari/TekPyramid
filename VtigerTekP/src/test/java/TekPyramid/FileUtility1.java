package TekPyramid;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility1 {
	private String FilePath;

	/**
	 * This method is used to read data from property file 
	 *@author surosh
	 *param key
	 * @param IpathConstant 
	 *@return
	 *@throws IOException
	 **/
	public String readDatafromPropertyFile(String key)throws IOException
	{
	
	FileInputStream fis=new FileInputStream(FilePath);
	Properties pObj=new Properties();
	pObj.load(fis);
	String value=pObj.getProperty(key);
	return value;
}
}
