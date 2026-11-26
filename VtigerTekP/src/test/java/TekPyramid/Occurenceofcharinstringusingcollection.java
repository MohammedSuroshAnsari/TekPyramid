package TekPyramid;

import java.util.LinkedHashMap;

public class Occurenceofcharinstringusingcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java";
		LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
		for(int i=0;i<s.length();i++)
		{
		char ch=s.charAt(i);
		if(!map.containsKey(ch))
		{
			map.put(ch, 1);
		}
		else
		{
			map.put(ch,map.get(ch)+1);
		}
		}
		System.out.println(map);
}
}
