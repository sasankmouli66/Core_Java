package com.arrays;

public class Min_max {

	public static void main(String[] args) {
		int[] arr = {5,9,4,7,2};
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
			else if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Min value :"+min);
		System.out.println("Max value :"+max);

	}

}
