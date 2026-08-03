package com.bank_pos;

import java.util.Scanner;

public class Bank extends State_Bank {
	static Scanner sc = new Scanner(System.in);	
	public static void main(String[] args) {	
		Bank B1 = new Bank();
		String name = B1.getCustomerName();
		System.out.println("Welcome to Sasank Hemo Loans  "+ name );
		boolean phoneValid = B1.isValidphone();
		boolean PanValid = B1.isPanValid();
		boolean ArdharValid = B1.isArdharValid();
		double sal = B1.getsal();
		double cibil = B1.cibilInfo();
     	int age = B1.getage();	
		if(phoneValid && PanValid && ArdharValid)
		{
			if (sal >= 800000.00 && (age >= 20 && age <= 60) && (cibil >= 350 && cibil <= 950)) 
			{
				System.out.println("Congratution !! Your are Eligible For Loan");
				System.out.println("your Rate of Intrest is : " + B1.getROI());
			} 
			else 
			{
				System.out.println("your not eligible for loan");
			}
		
		}else {
			System.out.println("Invalid Details");
		}
	}

}
