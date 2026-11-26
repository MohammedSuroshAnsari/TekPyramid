package TekPyramid;

public class ConvertFirstWordToCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="my name is monkey d luffy";
		String[]arr=str.split("");
		for(String word:arr)
		{
			System.out.println(Character.toUpperCase(word.charAt(0))+word.substring(1)+"");
			}
		}
	}
