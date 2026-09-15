package com.loop;

import java.util.Scanner;

public class Check_prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		for (int i = 1; i <=n; i++) {
			if (prime(i)) {
				System.out.println(i);
			}
		}
	}
	static boolean prime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if(n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		}
		return false;
	}

}
