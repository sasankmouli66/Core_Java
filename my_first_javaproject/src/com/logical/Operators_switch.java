package com.logical;
import java.util.Scanner;
public class Operators_switch {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String yn;
	do {
		System.out.println("Enter a value :");
		double a = sc.nextInt();
		
		System.out.println("Enter b value :");
		double b = sc.nextInt();
		
		System.out.println("Calculator Info....");
		String calculator = sc.next();
		switch(calculator)
		{
		case "+" ->{
			System.out.println("Addititon :"+(a+b));}
		case "-" ->{
			System.out.println("Subtration :"+(a-b));}
		case "*" ->{
			System.out.println("Multiplication :"+(a*b));}
		case "/" ->{
			System.out.println("Divivded :"+(a/b));}
		case "%" ->{
			System.out.println("Modules :"+(a%b));}
		default ->{ System.out.println("Invalid operator");
		}
		}
		System.out.println("Can u continue enter yes and not continue enter no");
		yn = sc.next();
	}while (yn.equalsIgnoreCase("yes"));
		System.out.println("Exists");
		sc.close();
	}
}
