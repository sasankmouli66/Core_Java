package com.whileloop;
import java.util.Scanner;
public class Digits {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number :");
	int n = sc.nextInt();
	int sum = sumDigits(n);
	int count = count(n);
	
	System.out.println("Sum of Digits :"+sum);
	System.out.println("Count of Digits:" +count);

	}
	
	static int count(int n) {
		int count = 0;
		while(n > 0) {
			int r = n % 10;
			count++;
			n = n / 10;
		}
		return count;
	}
	
	static int sumDigits(int n) {
		int sum = 0;
		while(n > 0) {
			int r = n % 10;
			sum = sum + r;
			n = n / 10;
		}
		return sum;
	}

}
