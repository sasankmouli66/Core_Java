//1. Largest Rectangle in Histogram
//Given an array representing the heights of bars in a histogram:
//int[] heights = (2, 1, 5, 6, 2, 3);
//Find the largest rectangular area that can be formed using consecutive bars.
//Expected output:
//Largest Area - 10
//Example: The bars with heights 5 and 6 form the largest rectangle with area 5 x 2 = 10.

package com.arrays;

public class Histogram {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 5, 6, 2, 3 };
	
		int count1 = 0;
		int count = 0;
		int value = 0;
		for (int i = 0; i < arr.length; i++) {
			int left = 0;
			
		for(int j = 1;j < i;j++) {
			if (arr[i] > left) {
				value = arr[i];
				count++;
			}
		}
		
			int right = 0;
			
			for (int k = 0;k < i;k++) {
				if (arr[k] < right) {
					value = arr[i];
					count1++;
				}
			}
			
		}
		System.out.println(count);
		System.out.println(count1);
		System.out.println(value);
		

	}

}
