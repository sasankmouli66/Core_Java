package com.logical;

import java.util.Scanner;
public class Atm {
	static double balance = 2000;
	public  void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Atm details");
	String atm = sc.nextLine();
	
	switch(atm)
	{
	case "chekBalance":
		System.out.println("Total Balance  :"+ balance);
		break;
	case "deposite":
		System.out.println("Enter deposite amount :");
		double deposite = sc.nextDouble();
		deposite(deposite);
		System.out.println("Sucessfull Deposite");
		System.out.println("Total amount balnce :"+balance);
		break;
	case "withdraw":
		System.out.println("Enter withdraw amount:");
		double withdraw = sc.nextDouble();
		withdraw(withdraw);
		System.out.println("Withdrwa Sucessfull ");
		System.out.println("Total amount balnce :"+balance);
	default :
		System.out.println("Not Exists Details");
	}

	}
	double deposite(double deposite)
	{
		balance = balance + deposite;
		return balance;
	}
	double withdraw(double withdraw)
	{
		balance = balance - withdraw;
		return balance;
	}

}
