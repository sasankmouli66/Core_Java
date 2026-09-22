package com.datatypes;
import java.util.Scanner;
public class Integer {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	System.out.println("Enter a number :");
	int n = sc.nextInt();
	int temp = 0;
	String binary = "";
	while(n > 0) {
		temp = n % 2;
		binary = temp + binary;
		n = n / 2;	
	}
	System.out.println(binary);
	}

}
