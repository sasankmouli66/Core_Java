package com.logical;

import java.util.Scanner;

public class Logical {
	double balance = 25000;

	public void main(String[] args) {
		System.out.println("Bank of Board Banking Pvt lit..");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Withdraw Amount");
		double wDraw = sc.nextDouble();
		with_Draw(wDraw);
		sc.nextLine();
		System.out.println("Enter Deposite Amount");
		double deposite = sc.nextDouble();
		dAmount(deposite);
		
		sc.close();

	}
	void check_Balance(double balance) {
		if (balance <= 100000) {
			System.out.println("main balnce :"+balance);
		}
		else {
			System.out.println("your Limit Reached....!");
		}

	}

	void with_Draw(double wDraw) {
		if (balance >= wDraw) {
			System.out.println("Banking Transation Withdraw");
			balance = balance - wDraw;
			check_Balance(balance);
		} else {
			System.err.println("Infuseint Funds in Bank Balance");
		}
	}

	void dAmount(double deposite) {
		if (100000 >= deposite) {
			System.out.println("Banking Transaction Deposite");
			balance = balance + deposite;
			check_Balance(balance);
		} else {
			System.out.println("Deposite :"+ deposite);
			System.err.println("Deposite Amount Max Limit reached !!!");
		}
	}

}
