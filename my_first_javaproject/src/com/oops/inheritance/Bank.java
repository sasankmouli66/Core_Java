package com.oops.inheritance;

class Account{
	
	double balance = 2000.00;
	
	void accoutDetais() {
		System.out.println("Welcome to bank !");
	}
	
	void userDetails() {
		System.out.println("your Account has opened Sucessfully...!");
	}
	
}

class Transfer extends Account{
	
	void deposite(double amount) {
		System.out.println("Your balance is :"+ amount); 
		balance = balance + amount;
		chekBalance();
	}
	
	void withDraw(double amount) {
		System.out.println("Your with draw amount :"+ amount);
		balance = balance - amount;
		chekBalance();
	}
	
	void chekBalance() {
		System.out.println("your check balance :"+ balance);	
	}
	
}


public class Bank {

	public static void main(String[] args) {
		Transfer b1 = new Transfer();
		b1.accoutDetais();
		b1.deposite(1000.00);
		
		System.out.println("Thank u visit again..!");

	}

}
