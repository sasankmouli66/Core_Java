package com.loop;

import java.util.Scanner;

public class NthPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		
		for(int number = 1;number<=100;number++) {
		if (prime(number)) {
			num++;
			if(number == num) {
				System.out.print(number+" ");
				break;
			}	
		} 
		sc.close();
	}
	}
	static boolean prime(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if(count == 2) {
			return true;
		}
		return false;
		
	}

}
