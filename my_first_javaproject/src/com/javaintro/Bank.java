package com.javaintro;

import java.util.Scanner;

public class Bank {
	static Scanner in = new Scanner(System.in);
	static int AcconutNo = 10001;
	static void StateBank()
	{
		Scanner in = new Scanner(System.in);
		int AccountNo = in.nextInt();
		in.nextLine(); 
		String AccountName = in.nextLine();
		int BankBalance = in.nextInt();
		
		System.out.println("Account No : "+ AccountNo);
		System.out.println("Account Name :" + AccountName);
		System.out.println("Bank Balance :" + BankBalance);		
		AcconutNo++;
	}

	public static void main(String[] args) {
		
		for(int i = 1;i<=3;i++) {
			System.out.println("Enter Bank Details :"+ i);
			StateBank();
		}
	}
}

//public class Bank{
//	
//	static String ISFC_code = "SBI05U9";
//	public static void main(String[] args) {
//		
		
		





























