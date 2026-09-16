package com.whileloop;

import java.util.Scanner;

public class even_Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int result = evenDigits(n);
		System.out.println(result);
	}

	static int evenDigits(int n) {
		int sum = 0;
		int count = 0;
		while(n > 0) {	
			int r = 0;
			r = n % 10;
			count++;
			if(count % 2 == 0) {
				sum += r;
			}
			n = n / 10;
		}
		return sum;
	}
}
