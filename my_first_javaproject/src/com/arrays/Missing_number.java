package com.arrays;

public class Missing_number {

	public static void main(String[] args) {
		int[] arr = {1,3,4,5,7,9};	
		
		int min = arr[arr.length - 1];
		for(int i =1;i <= min;i++) {
			boolean found = false;
			for(int j = 0;j < arr.length;j++) {
				if(arr[j] == i) {
					found = true;
					break;
				}
			}
			if(!found) {
				System.out.println(i);
			}
		}
		
	}

}
