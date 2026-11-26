package TekPyramid;
public class Remove2ConsecutiveCharacters {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abccba";
		System.out.println(s);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				s=s.substring(0,1)+s.substring(i+2);
				i=0;
				System.out.println(s);
}
}
}
}

	
