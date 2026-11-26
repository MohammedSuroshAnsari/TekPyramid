package TekPyramid;

public class Occuranceofcharinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java";
		char[] str=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(str[i]==str[j])
				{
					count++;
					str[j]='\0';
					System.out.println(str[i]+"---->"+count);
}
}
}
}
}
