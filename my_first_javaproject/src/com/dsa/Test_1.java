package com.dsa;
import java.util.Arrays;
//import java.util.Arrays;
public class Test_1 {

	public static void main(String[] args) {
		int[] arr = {5,7,3,1};
		int temp = 0;
		for(int i = 0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j] > arr[j+1]) 
				{
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				}
			 
		    }
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
