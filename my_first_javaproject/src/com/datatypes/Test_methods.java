package com.datatypes;
import java.util.Scanner;
public class Test_methods {
	static void details(String name,int Id) {
//		System.out.println("Main method .........");
		System.out.println("Enter a name :"+name);
		System.out.println("Enter a Id :"+Id);
	}
	
	void details1(int age,float height)
	{
		System.out.println("Enter a Age :"+age);
		System.out.println("Enter a Height :"+height);
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Test_methods t = new Test_methods();
	System.err.println("AAAAAAAAAAAAAAAAAA");
	String name = sc.next();
	int Id = sc.nextInt();
//	float height = sc.nextFloat();
	int age = sc.nextInt();
	float height = sc.nextFloat();
	details(name,Id);
	t.details1(age,height);
}
}