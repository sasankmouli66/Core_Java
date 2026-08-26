package com.constructors;

import java.lang.reflect.Array;

public class a {

	public static void main(String[] args) {
		int[] arr = {52,96,25};
		int temp = 0;
		int left = 0;
		int right = arr.length - 1;
		while(left < right)
		{
			temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		for(int num:arr)
		{
			System.out.print(num + " ");
		}
	}
}
