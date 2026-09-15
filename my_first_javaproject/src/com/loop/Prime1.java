package com.loop;

import java.util.Scanner;

public class Prime1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr a number  :");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (prime(i)) {
					System.out.println(i);
			}
		}
	}
	static boolean prime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			status = false;
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
