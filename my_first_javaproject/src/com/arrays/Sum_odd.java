package com.arrays;

public class Sum_odd {

	public static void main(String[] args) {
		int arr[] = {5, 9, 4, 7, 2};
		int sum = 0;
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] != 0) {
				sum += arr[i];
			}
		}
		System.out.println(sum);
	}

}
