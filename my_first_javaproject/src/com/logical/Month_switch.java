package com.logical;
import java.util.Scanner;
public class Month_switch {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Month ");
	int month = sc.nextInt();
	
	switch(month) {
	case 1 :
		System.out.println("Januvary");
		break;
	case 2 :
		System.out.println("Febuary");
		break;
	case 3 :
		System.out.println("March");
		break;
	case 4 :
		System.out.println("April");
		break;
	case 5 :
		System.out.println("May");
		break;
	case 6 :
		System.out.println("June");
		break;
	case 7 :
		System.out.println("July");
		break;
	case 8 :
		System.out.println("August");
		break;
	case 9: 
		System.out.println("Septmber");
		break;
	case 10:
		System.out.println("Octber");
		break;
	default :
		System.out.println("Invalid Month");
		
	}

	}

}
