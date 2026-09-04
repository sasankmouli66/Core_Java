package com.logical;
import java.util.Scanner;
class Even_odd_switch {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a value");
	int number = sc.nextInt();
	
	switch(number%2) {
	case 0 :
		System.out.println("Even");
		break;
	case 1:
		System.out.println("Odd");
		break;
	default :
		System.out.println("Invalid Number");
	}
	sc.close();
	}

}
