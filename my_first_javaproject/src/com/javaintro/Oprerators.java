package com.javaintro;
import java.util.Scanner;

//public class Oprerators {
//	void Add(int a, int b)
//	{
//		int res=a+b;
//		System.out.println("Addition : "+ res);
//		Sub(res,7);
//	}
//	
//	void Sub(int a, int b)
//	{
//		int res=a-b;
//		System.out.println("Subtration : "+res);
//		Multiply(res,10);
//	}
//	
//	void Multiply(int a, int b)
//	{
//		int res=a*b;
//		System.out.println("Multipy : "+res);
//		Div(res,10);
//	}
//	
//	void Div(int a, int b)
//	{
//		System.out.println("Division : "+ (a / b));
//	} 
//	public static void main(String[] args) {
//		Oprerators s = new Oprerators();
//		 s.Add(10, 20);
//		 }
//
//}

public class Oprerators {
	
	int add(int a, int b)
	{
		int res=a+b;
		System.out.println("Addition : "+ res);
		return res;
	}
	
	int sub(int a, int b)
	{
		int res=a-b;
		System.out.println("Subtration : "+res);
		return res;
	}
	
	int multiply(int a, int b)
	{
		int res=a*b;
		System.out.println("Multipy : "+res);
		return res;
	}
	
	int Div(int a, int b)
	{
		int res = a / b;
		System.out.println("Division : "+ res);
		return res;
	} 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int a = sc.nextInt();
		System.out.println("Enter a value : ");
		int b = sc.nextInt();
		Oprerators s = new Oprerators();
		int result = s.add(a,b);
		int result1 = s.sub(result, b);
		int result2 = s.multiply(result1,b);
		int result3 = s.Div(result2,b);
		System.out.println("All Final cal :"+ result3);
	}

}













