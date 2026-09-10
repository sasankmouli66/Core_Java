package com.loop;

import java.util.Scanner;

public class numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		num(n);
	}

	static void num(int n) {
		if (n > 100) {
			return;
		}
		System.out.println(n);
		n++;
		num(n);
	}
}
