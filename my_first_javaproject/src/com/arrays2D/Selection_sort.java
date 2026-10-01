package com.arrays2D;

import java.util.Arrays;

public class Selection_sort {

	public static void main(String[] args) {
		int[] n = {64 ,25, 12, 22 ,11 };
		
		int temp = 0;
		int minIndex = 0;
		for(int i = 0;i < n.length;i++) {
			minIndex = i;
			for(int j = i + 1;j < n.length;j++ ) {
				if(n[j] > n[minIndex]) {
					minIndex = j;
				}
				
				temp = n[j];
				n[j] = n[minIndex];
				n[minIndex] = temp;
			}
		}
		System.out.println(Arrays.toString(n));
		System.out.println(minIndex);

	}

}
