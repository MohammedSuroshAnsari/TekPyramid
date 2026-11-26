package TekPyramid;

public class Expansion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a362c4d1";
		for(int i=0;i<s.length()-1;i=i+2)
		{
			char ch=s.charAt(i);
			int index=s.charAt(i+1)-48;
			for(int j=1;j<index;j++)
			{
				System.out.println(ch);
			}
			}
		}
	}
