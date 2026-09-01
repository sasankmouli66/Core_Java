//1. Write a Java Program to Swap two variables data using 
//Arithmetic operators and using Temporary Variable
//Ex:- a=10,
//        b= 20
//Output :- 
//a=20,
//b= 10
//2. Write a Java Program to Swap the two Variables values Using BitWise Operators 


package com.operatiors;

public class Operators_task {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int temp = 0;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a = "+a +" "+"b = "+b);
		System.out.println("----------------------------");
//		=============== Arthematic ====================
		System.out.println("Additio   :"+(a+b));
		System.out.println("Subration :"+(a-b));
		System.out.println("Miltiply  :"+ (a * b));
		System.out.println("Modules   :"+(a % b));
		System.out.println("Divided   :"+ (a/b));
		System.out.println("------------Bitwise-------------------");
//		==================== Bitwise =====================
		System.out.println("AND OPERATOR    :"+(a & b));
		System.out.println("XOR OPERATOR    :"+(a | b));
		System.out.println("TITLE OPERATOR  :"+ (~a));
		System.out.println("LEFT SHIFT      :"+(a << b));
		System.out.println("RIGHT SHIFT     :"+ (a>>>b));
		
	}

}
