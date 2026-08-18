package com.datatypes;

import java.util.Scanner;

public class Emp_Method {
static Scanner sc = new Scanner(System.in);
	double emp_Sal()
	{
		System.out.println("Enter a sal :");
		double Sal = sc.nextDouble();
		return Sal;
	}
	
	double bouns() 
	{
		System.out.println("Enter a sal :");
		double a = sc.nextDouble();
		return a;
	}

	public static void main(String[] args) {
		Emp_Method e = new Emp_Method();
		double sal = e.emp_Sal();
		double sa11 = e.bouns();
		
		System.out.println("Salary         :"+sal );
		System.out.println("Bonous         :"+sa11);
		System.out.println("total          :"+(sal+sa11));
	}

}
