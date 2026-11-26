package TekPyramid;

import java.io.FileReader;

import javax.security.auth.login.AccountException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonUtility {
	public String getDataFromJsonFile(String key) throws Throwable, AccountException {
	FileReader FileR=new FileReader("./configAppData/appcommonData.Json");
	JSONParser parser=new JSONParser();
	Object obj=parser.parse(FileR);
	JSONObject map=(JSONObject)obj;
	String data =(String) map.get(key);
	return data;
	}
    }
