package TekPyramid;

public class Toprintduplicatevalueinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(s.indexOf(ch)==s.lastIndexOf(ch))
			{
				System.out.println(ch);
			}
			}
		}
	}
