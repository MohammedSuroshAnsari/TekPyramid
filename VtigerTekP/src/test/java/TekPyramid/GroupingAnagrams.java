package TekPyramid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class GroupingAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]arr= {"earth","heart","care","race","decide"};
		LinkedHashMap<String,ArrayList<String>> map=new LinkedHashMap();
		for(int i=0;i<arr.length;i++)
		{
			char[]set=arr[i].toCharArray();
			Arrays.sort(set);
			String value=new String(set);
			if(!map.containsKey(value)) {
				map.put(value, new ArrayList<String>());
				map.get(value).add(arr[i]);
			}else {
				map.get(value).add(arr[i]);
			}
			}
		System.out.println(map.values());
}
}
