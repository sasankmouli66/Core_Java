package com.arrays;

public class marks {

	public static void main(String[] args) {
		int[] arr = { 36, 45, 78, 66, 99 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			temp = arr[i] % 10;
			if (temp <= 5) {
				arr[i] = arr[i] - temp;
			} else {
				arr[i] = arr[i] + (10 - temp);
			}
			System.out.print(arr[i] + " ");
		}

	}

}
