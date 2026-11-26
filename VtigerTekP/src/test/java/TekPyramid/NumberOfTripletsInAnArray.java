package TekPyramid;

public class NumberOfTripletsInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,1,1,1,2,2,2,3,3,4,4,4,4};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			int count1=1;
			int j=i+1;
			while(j<arr.length&&arr[i]==arr[j])
			{
				count++;
				j++;
			}
			if(count1==3)
			{
			count++;
			}
			i=j;
		}
			System.out.println(count);
			}
			}
	

