package com.loop;

import java.util.Scanner;

public class factor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.print("factor check :");
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
}
