package com.javaintro;

public class Bank1 {
	static String BankName ="SBI";
	int AccountNum;
	int Balance;
	void deposite()
	{
	  int deposite = 400;
	  Balance += deposite;
	  System.out.println("Deposite =" + Balance);
	  CheckBalance();
	}
	void withdraw() 
	{
		int withdraw = 1000;
		Balance -= withdraw;
		System.out.println("Withdraw =" + Balance);
		CheckBalance();
	}
	void CheckBalance()
	{
		System.out.println("checkBalance =" + Balance);
	}
	
	public static void main(String[] args) 
	{
		Bank1 s = new Bank1();
		s.Balance=10000;
		s.deposite();
		s.withdraw();
		System.out.println("BankName =" + BankName);
		System.out.println("-----------------------------------");
		
		Bank1 t = new Bank1();
		t.Balance = 2000;
		t.deposite();
		t.withdraw();
		System.out.println("BankName =" + BankName);
		System.out.println("-----------------------------------");

	}

}
