package com.dsa;
import java.util.Arrays;

//////////Selection Sort////////////
public class test_2 {

	public static void main(String[] args) {
		int[] arr = {4,6,1,96,2};
		int temp = 0;
//		int minIndex;
		for(int i = 0;i<arr.length-1;i++)
		{
			 int minIndex = i;
			for(int k=i+1;k<arr.length;k++)
			{
				if(arr[k] < arr[minIndex])
				{
				 minIndex = k;
				}
			}
			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;	
		}
		System.out.println(Arrays.toString(arr));
	}
}
