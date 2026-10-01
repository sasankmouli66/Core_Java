package com.arrays;

import java.util.Arrays;

public class Target {

	public static void main(String[] args) {
		int[] arr = { 7, 0, 1, 4, 3, 6, 5 };

		int target = 7;
//		int left = 0;
//		int right = arr.length - 1;
//		int sum = 0;
//		
//		while(left<right) {
//			sum = arr[left] + arr[right];
//			
//			if(sum == target) {
//				System.out.println(arr[left] + " + " + arr[right]);
//				left++;
//				right--;										
//			}
//
//			else if(sum < target){
//				left++;
//				
//			}
//			else {
//				right--;
//			}	
//		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (target == arr[i] + arr[j]) {
					System.out.println(arr[i] + "," + arr[j]);
				}
			}
		}
	}

}
