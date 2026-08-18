
package com.datatypes;
import java.util.Scanner;

public class Bank_method {
	double bal_amount = 2000;
	void deposite(double amount)
	{
		if(amount>0)
		{
			bal_amount = bal_amount + amount;
//			System.out.println("Available Balance :"+bal_amount);
		}
		else
		{
			System.out.println("Invalid Details");
		}
	}
	
	void with_Draw(double Wamount)
	{
		if(Wamount <= bal_amount)
		{
			bal_amount = bal_amount - Wamount;
//			System.out.println("Balance Amount :"+bal_amount);
		}
		else 
		{
			System.out.println("Insuffenct Funds");
		}
	}
	
	void balance()
	{
		System.out.println("Balance Amount : "+bal_amount);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Amount :");
		double amount = sc.nextDouble();
		
		System.out.println("Enter a wAmount :");
		double Wamount = sc.nextDouble();
		
		Bank_method a = new Bank_method();
		a.deposite(amount);
		a.with_Draw(Wamount);
		a.balance();
	}

}
