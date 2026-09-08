//Write a Java program to calculate the electricity bill based on the 
//connection type and the number of units consumed.
//Requirements:
// > Ask the user to enter   connection type
//a) → Domestic
//b) → Commercial
//› Using switch case to determine the selected connection type.
//› Ask the user to enter the number of units consumed.
//
//a) Domestic Connection:
//› If units are 100 or less, charge 2 per unit.
//If units are greater than 300 charge 3 change a per unit 
//
//b) Commercial Connection:
//› If units are 100 or less, charge 4 per unit.
//› If units are greater than 100 and up to 300, charge 6 per unit.
//› If units are greater than 300, charge 8 per unit. Atlast, display the following details:
//Connection Type
//Units Consumed
//Rate Per Unit
//Total Electricity Bill
package com.logical;
import java.util.Scanner;
public class Electricity_bill {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Type bill");
	String type = sc.nextLine();
	switch(type) {
	case "A"->{
		String A = "commericial";
		System.out.println(A);
		System.out.println("Enter units:");
		int units = sc.nextInt();
		int charge = 0;
		int cost = 0;
		if(units <= 300) {
			charge = 2;
			 cost = units * charge ;
		}
		else if(units >= 300) {
			charge = 3;
			cost = units * charge ;
		}
		else {
			System.out.println("Invalid Bill");
		}
		System.out.println("Type         	      :"+A);
		System.out.println("Total one unit charged:"+ charge);
		System.out.println("Total units Comsumed  :"+units);
		System.out.println("Tota bill Electricity :"+cost);
	}
	case "B"->{
		String B = "demostic";
		System.out.println(B);
		System.out.println("Enter how many units used:");
		int units = sc.nextInt();
		int chargeUnit = 0;
		int cost = 0;
		if(units <= 100) {
			chargeUnit = 4;
			cost = units * chargeUnit ;
		}
		else if(units >= 100 && units <= 300) {
			chargeUnit = 6;
			cost = units * chargeUnit ;
		}
		else if(units > 300){
			chargeUnit = 8;
			cost = units * chargeUnit ;
		}
		System.out.println("Type         	       :"+B);
		System.out.println("total one unit cost    :"+chargeUnit);
		System.out.println("Tota units Comsumed    :"+units);
		System.out.println("Total Bill Electricity :"+cost);
	}
	default ->{
		System.out.println("Invalid details");
	}
	}
	}	
}
