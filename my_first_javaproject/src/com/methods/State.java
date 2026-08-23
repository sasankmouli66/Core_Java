package com.methods;
import java.util.Scanner;
public class State {
    double balance = 0;
	 String details(String name)
	{
		 return name;
	}
	 int accountno(int accountno)
	 {
		 return accountno;	 
	 }
	double deposite(double amount)
	{
		balance = balance + amount;
		return balance;
	}
	
	double withdraw(double withdraw)
	{
		balance = balance - withdraw;
		return withdraw;
	}
	
	double intrest(double intrest)
	{
		return intrest;
	}
	
	double intrest(double intrest, double balance)
	{
		intrest = (balance * intrest)/100;
		return intrest + balance;
	}

	double transfer1(double amount,State reciver)
	{
		balance = balance + amount;
		reciver.balance = reciver.balance + amount;
		return reciver.balance;
	}
    
	public static void main(String[] args) {

		State s = new State();
		State s1 = new State();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a customer name:");
		String name = sc.nextLine();
		
		System.out.println("Enter a Acc no :");
		int accountno = sc.nextInt();
		
		System.out.println("enter a amount:");
		double amount = sc.nextDouble();
		
		System.out.println("enter withdraw:");
		double withdraw = sc.nextDouble();
		
		System.out.println("enter intrest :");
		double intrest = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter a customer name2:");
		String name2 = sc.nextLine();
		
		System.out.println("Enter a Acc no2 :");
		int accountno2 = sc.nextInt();
		
		System.out.println("enter a amount2:");
		double amount2 = sc.nextDouble();
		
		String customerName = s.details(name);
		int Accountno = s.accountno(accountno);
		double Deposite = s.deposite(amount);
		double Withdraw = s.withdraw(withdraw);
		double intrest1 = s.intrest(intrest);
		double Total_Amount = s.intrest(intrest1, Withdraw);
		
		String customerName2 = s1.details(name2);
		int Accountno2 = s1.accountno(accountno2);
		double balance2 = s1.deposite(amount2);
		double deposite = s.transfer1(withdraw,s1);
		double Total_Amount2 = s1.intrest(intrest, deposite);

		System.out.println("Customer Name :"+customerName);
		System.out.println("Account no    :"+Accountno);
		System.out.println("balance       :"+Deposite);
		System.out.println("withdraw      :"+Withdraw);
		System.out.println("intrest1      :"+intrest1);
		System.out.println("total amount with intrest :"+Total_Amount);
		System.out.println("===========================================");
		System.out.println("Customer Name :"+customerName2);
		System.out.println("Account no    :"+Accountno2);
		System.out.println("balance       :"+balance2);
		System.out.println("deposite      :"+deposite);
		System.out.println("total amount 2:"+Total_Amount2);
	}

}
