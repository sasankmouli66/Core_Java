//Variables:
//
//accountNo
//customerName
//balance
//branch
//
//Use:
//
//no-argument constructor
//parameterized constructor
//overloaded constructor
//copy constructor
//constructor chaining using this()
//inheritance using super()

package com.constructors;
class Bank1
{
	long accno;
	Bank1(int accno)
	{
		this.accno = accno;
	}
}
class Bank2 extends Bank1
{
	String name;
	Bank2(int accno,String name)
	{
		super(accno);
		this.name = name;
	}
}
public class Bank extends Bank2 {
	double balance;
	String branch;
	Bank(int accno,String name,double balance,String branch)
	{
		super(accno,name);
		this.balance = balance;
		this.branch = branch;
	}
	public static void main(String[] args) {
		Bank b = new Bank(250,"james",50000,"hyb");
		b.show();
	}
	void show()
	{
		System.out.println("Account number :"+accno);
		System.out.println("Customer Name  :"+ name);
		System.out.println("Balance        :"+ balance);
		System.out.println("branch         :"+branch);
	}
}
