package TekPyramid;

public class Remove2ConsecutiveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abccba";
		System.out.println(s);
		String New="";
		for(int i=0;i<s.length()-1;i++)
		{
			New=New+s.charAt(i);
			if(s.charAt(i)==s.charAt(i+1))
			{
				s=s.replaceAll(New,"");
				i=-1;
				System.out.println(s);
			}
			New="";
	}
	}
	}
