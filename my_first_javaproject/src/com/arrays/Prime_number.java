package com.arrays;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size :");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter array values :");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Representing Values :");
		for(int i = 0;i < arr.length;i++) {
			if(isPrime(arr[i])) {
				System.out.println(arr[i]);
			}
		}

	}
	
	static boolean isPrime(int n) {
		boolean status = true;
		
		if(n == 0|| n==1) {
			return false;
		}
		
		for(int i = 2;i <= n / 2;i++) {
			if(n % i ==0) {
				status = false;
				break;
			}
		}
		return status;
	}

}
