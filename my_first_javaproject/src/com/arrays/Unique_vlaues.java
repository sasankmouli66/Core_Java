package com.arrays;

import java.util.Arrays;

public class Unique_vlaues {

	public static void main(String[] args) {
		int[] arr = {1,6,8,2,8,1};
		int count= 0;
		for(int i = 0;i < arr.length;i++) {
			
			for(int j = 0;j < arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;	
				}
			}	
		}
		System.out.println(count);
		
		

	}

}
