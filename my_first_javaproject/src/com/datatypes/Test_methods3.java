package com.datatypes;

import java.util.Scanner;

public class Test_methods3 {
	
	int  add(int a,int b)
	{
		int sum = a + b;
		System.out.println("Addition :"+sum);
		return sum;
	}
	
	int sub(int a ,int b) 
	{
		int sub = a - b;
		System.out.println("Subtration : "+sub);
		return sub;
	}
	
	int multi(int a,int b)
	{
		int multi = a * b;
		System.out.println("Multication : "+multi);
		return multi;
	}
	
	int div(int a,int b)
	{
		int div = a / b;
		System.out.println("Subtration :"+div);
		return div;
	}
	
	int sq(int a)
	{
		int sq = a*a;
		System.out.println("Square :"+ sq);
		return sq;
	}

	int cube(int a)
	{
		int cube = a*a*a;
		System.out.println("Square :"+ cube);
		return cube;
	}
	
	void  min(int a , int b)
	{
		boolean min = a>b;
		System.out.println("Minimun :"+ min);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int a = sc.nextInt();
		System.out.println("Enter a number :");
		int b = sc.nextInt();
		
		Test_methods3 t = new Test_methods3();
		t.add(a,b);
		t.sub(a,b);
		t.multi(a,b);
		t.div(a, b);
		t.sq(a);
		t.cube(a);
		t.min(a,b);
	}

}
