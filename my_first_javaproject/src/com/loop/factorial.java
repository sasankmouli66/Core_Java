package com.loop;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int res = factor(n);
		System.out.println(res);
	}

	static int factor(int n) {
//		int fact = 1;
//		for (int i = n; i >= 1; i--) {
//			fact = fact * i;
//		}
//		return fact;
		int fact = 1;
		if(n==0 || n==1) {
			return 1;
		}
		return n * factor(n - 1);
		
	}
}
