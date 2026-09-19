package com.loop;

import java.util.Scanner;

//public class Class {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enere a number");
//		int number = sc.nextInt();
//		int count = 0;
//		for (int i = 0; i < number; i++) {
//			if (checkPrime(i)) {
//				count++;	
//			}
//		}
//		System.out.println(count);
//	}
//
//	static boolean checkPrime(int number) {
//		int count = 0;
//		for (int i = 1; i <= number; i++) {
//			if (number % i == 0) {
//				count++;
//			}
//		}
//		if (count == 2) {
//			return true;
//		}
//		return false;
//	}
//
//}

public class Class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Emter a number");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (prime(i)) {
				count = count + i;
				System.out.println(i);
			}
		}
		System.out.println(count);
	}

	static boolean prime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}
}
