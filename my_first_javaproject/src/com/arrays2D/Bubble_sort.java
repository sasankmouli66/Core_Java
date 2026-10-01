package com.arrays2D;

import java.util.Arrays;

public class Bubble_sort {

	public static void main(String[] args) {
		int[] arr = {9,2,8,5};
		
		System.out.println("Arraya Before Sorted :");
		System.out.println(Arrays.toString(arr));
		int temp = 0;
		int count = 0;
		int count1 = 0;
		for(int i = 0;i < arr.length;i++) {
			count++;
			for(int j = 0;j < arr.length-1-i;j++) {
				if(arr[j] > arr[j + 1]) {
					
					boolean swap = true;
					temp = arr[j];
					arr[j ] = arr[j + 1];
					arr[j + 1] = temp;
					
				}
				count1++;
			}
			if(true) {
				break;
			}
			
		}
		System.out.println("Arraya After  Sorted :");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Count :"+ count);
		System.out.println("Count1 :"+ count1);

	}

}
