package TekPyramid;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="my2 hi1 name3 luffy5 is4";
		String[]str=s.split("");
		String[]res=new String[str.length];
		for(int i=0;i<str.length;i++)
		{
		String word=str[i];
		int index=word.charAt((word.length()-1))-48;
		String w=word.substring(0,word.length()-1);
		res[index-1]=w;
		}
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]+"");
			}
		}
	}
