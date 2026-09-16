package com.whileloop;

import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = reverseCheck(n);
		System.out.println("Reverse Numbere :" + result);
		if (result == n) {
			System.out.println("Palidrome");
		} else {
			System.out.println("Not palidrome");
		}

	}

	static int reverseCheck(int n) {
		int r = 0;
		int temp = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			temp = temp * 10 + r;
		}
		return temp;
	}

}
