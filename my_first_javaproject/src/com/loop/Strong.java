package com.loop;

import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter a number :");
		int n = sc.nextInt();
//145	
//		int temp=n;
		int sum = 0;
		for (int temp=n; temp > 0;temp=temp/10) {
			int remin = temp % 10;
			int fact = 1;
			for (int i = 1; i <= remin; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
		}
		System.out.println(sum);
		if(sum == n) {
			System.out.println("orignal");
		}
		else {
			System.out.println("Not Orginal ");
		}
			
	}
}
