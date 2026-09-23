package com.arrays;

public class Second_max {

	public static void main(String[] args) {
	int arr[] = {5,9,10,6};
	
	int max = arr[0];
	int second_max = max;
	
	for(int i = 0;i < arr.length;i++) {
		if(arr[i] > max) {
			second_max = max;
			max = arr[i];
		}
	}
	System.out.println("Second Max value :"+second_max);

	}

}
