//Java :-
//1. Write a Java Program to find the Single digit , 
//double digit , triple digit  upto length prime numbers of a given number 
//
//Ex:- 12131456
//Output :- 2,3,5,31,13,…. Upto length

package com.whileloop;
import java.util.Scanner;
public class Signle_double_tri {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = sc.nextInt();
	int temp = 0;
	
	while(n > 0) {
		temp = n % 10;
		if(prime(temp)) {
			System.out.println(temp);
		}
		n = n / 10;
	}
	
	}
	static boolean prime(int temp) {
		int count = 0;
		for(int i = 1; i < temp;i++) {
			if(temp % i == 0) {
				count++;
			}
		}
		if(count == 2) {
			return true;
		}
		return false;
	}

}
