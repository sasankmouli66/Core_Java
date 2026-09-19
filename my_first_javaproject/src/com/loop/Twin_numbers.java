package com.loop;

import java.util.Scanner;

public class Twin_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (twinPrime(i)) {
				
			}
		}
	}

	static boolean twinPrime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

}
