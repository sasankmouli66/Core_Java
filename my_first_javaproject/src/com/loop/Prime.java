package com.loop;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		if (primeNumber(number)) {
			System.out.print( "prime"+ " ");
		}
		else
		{
			System.out.println("natural number");
		}
	}
	static boolean primeNumber(int number) {
		int count = 0;
		for (int i = number; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		if(count == 2)
		{
			return true;
		}
		return false;
	}

}
