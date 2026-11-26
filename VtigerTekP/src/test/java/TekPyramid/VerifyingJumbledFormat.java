package TekPyramid;

public class VerifyingJumbledFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method 
String mail="abcd@gmail.com";
String[] str=mail.split("@");
{
	if(str.length==2 &&! str[0].startsWith("")&& str[0].endsWith("")&&!str[0].contains("")&& str[0].matches("[a-z A-Z 0-9.]+$"))
	{
		if(str[1].equalsIgnoreCase("gmail.com"))
		{
			System.out.println("valid");
		} else
			System.out.println("invalid");
			}
	        }
}
}


