package TekPyramid;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class PrintIndexPositionOfNumbersOnOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,3,4,1,2,1,4,5,6,3,2,1};
		// output [4,6,12]
		//[5,11]
		//[10]
		//[7]
		LinkedHashMap<Integer,ArrayList<Integer>>map=new LinkedHashMap();
		for(int i=0;i<arr.length;i++) {
			boolean flag=false;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && flag==false) {
					if(!map.containsKey(arr[i])) {
						map.put(arr[i],new ArrayList<Integer>());
					}
					flag=true;
					map.get(arr[i]).add(j);
					}
					}
			        }
		System.out.println(map);
		}
		}


