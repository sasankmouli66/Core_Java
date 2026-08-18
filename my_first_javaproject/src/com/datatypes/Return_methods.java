
package com.datatypes;
import java.util.Scanner;

public class Return_methods {
	int sum;
	static void maximun(int a,int b,int c)
	{
		int min = Math.min(a, Math.min(b, c));
		System.out.println(min);
	}
	
	static void minimun(int a,int b,int c)
	{
		int max = Math.max(a, Math.max(b, c));
		System.out.println(max);
	}
	
	static void factorial(int a,int b)
	{
		int f = a * b;
		System.out.println(f);
	}
	
	static void power(int a,int b)
	{
		double s = Math.pow(a, b);
		System.out.println(s);
		System.out.println(s);
	}
	
	static void percentage(int a,int b)
	{
		float d = (a / b) * 100;
		System.out.println(d);
	}
	
	void marks(int a,int b,int c)
	{
		int sum = a + b + c;
		System.out.println(sum);
		avg(sum);
	}
	
	void avg(int sum)
	{
		int avg = sum /3;
		System.out.println(avg);
	}
	
	static void birth_Year(int a)
	{
		int birth = a - 2026;
		System.out.println(birth);
	}
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		System.out.println("Enter c value ");
		int c = sc.nextInt();
		
		maximun(a,b,c);
		minimun(a,b,c);
		factorial(a,b);
		power(a,b);
		percentage( a, b);
		
		Return_methods t = new Return_methods();
		t.marks(a, b, c);
//		t.avg(sum);
		birth_Year(a);
		
		
		
		
		
	}

}
