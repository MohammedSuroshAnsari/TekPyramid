package TekPyramid;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateContactDPTest {
@Test(dataProvider = "getData")
public void CreateContactTest(String firstName, String lastName,long PhoneNumber) {
System.out.println("FirstName:"+ firstName+", LastName:" +lastName +",PhoneNumber:"+PhoneNumber);
}
@DataProvider
public Object [][]getData(){
	Object [][] objArr=new Object[3][3];
	objArr[0][0]="deepak";
	objArr[0][1]="hr";
	objArr[0][2]=976754395;
	objArr[1][0]="sam";
	objArr[1][1]="sh";
	objArr[1][2]=987863098;
	objArr[2][0]="John";
	objArr[2][1]="Smith";
	objArr[2][2]=989321696;
	return objArr;
	}
	}
