// WAP zeros move to right and matain

package com.arrays;

import java.util.Arrays;

public class Zeros {

	public static void main(String[] args) {
		int[] arr = {1,0,2,0,9,0,7,0};
		
		for(int i = 0; i < arr.length-1;i++) {
		
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i+1] = temp;
				
				
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
