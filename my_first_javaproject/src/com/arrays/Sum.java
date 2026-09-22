package com.arrays;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number :");
	int[] arr = new int[5];
	
	for(int i = 0; i < arr.length;i++) {
		arr[i] = sc.nextInt();
	}
	
	int sum = 0;
	int product = 1;
	for(int i = 0; i < arr.length;i++) {
		sum += arr[i];
		product = product * arr[i];
	}
	
	System.out.println("Sum of Numbers :"+sum);
	System.out.println("Sum of Numbers :"+product);

	}

}
