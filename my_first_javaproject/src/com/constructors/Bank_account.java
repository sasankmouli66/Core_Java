//Create a class called BankAccount with the following instance variables: accountNumber, 
//accountHolderName, balance, branch
//Requirements:
//› Create a parameterized constructor to initialize all account details.
//>  Create a copy constructor that accepts another BankAccount object and copies its values.
//› Create a method displayAccountdetails) to display the account information.
//In the main method:
//Create an original BankAccount object.
//Create a second object using the copy constructor.
//Change the branch and balance of the copied account.
//Display both objects •

package com.constructors;

public class Bank_account {
	int account_Number;
	String account_Name;
	double balance;
	String branch;

	Bank_account(int account_Number,String account_Name,double balance,String branch)
	{
		this.account_Number = account_Number;
		this.account_Name = account_Name;
		this.balance = balance;
		this.branch = branch;
	}
	
	Bank_account(Bank_account c,int b,String p)
	{
		this.account_Number = c.account_Number;
		this.account_Name = c.account_Name;
		this.balance = b;
		this.branch = p;
	}

	public static void main(String[] args) {
		Bank_account b = new Bank_account(201,"james",5000,"hyb");
		b.display();
		
		Bank_account b1 = new Bank_account(b,20000,"kphb");
		b1.display();

	}
	void display()
	{
		System.out.println(account_Number);
		System.out.println(account_Name);
		System.out.println(balance);
		System.out.println(branch);
		System.out.println("======================");
	}
}
