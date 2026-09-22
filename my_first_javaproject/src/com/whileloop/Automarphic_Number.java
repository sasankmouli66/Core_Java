package com.whileloop;
import java.util.Scanner;
public class Automarphic_Number {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number :");
	int n = sc.nextInt();
	
	int result = n * n;
	
	if(result % 10 == n || result % 100 == n) {
		System.out.println("Authropic Number");
	}
	else {
		System.out.println("Not Autropic Number");
	}
	
	}

}
