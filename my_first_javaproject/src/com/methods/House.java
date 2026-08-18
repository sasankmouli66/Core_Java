
package com.methods;
import java.util.Scanner;
public class House {
static Scanner sc = new Scanner(System.in);
	String owner_name(String name)
	{
		System.out.println("enter a name :");
		name = sc.nextLine();
		return name;
	}
	
	long h_Number(long number)
	{
		System.out.println("enter a hou_no :");
		number = sc.nextInt();
		return number;
	}
	
	double h_Price(double price)
	{
		System.out.println("enter a hou_Price :");
		price = sc.nextDouble();
		return price;
	}
	
	int age (int age)
	{
		System.out.println("enter a h_age :");
		age = sc.nextInt();
		return 2026 - age;
	}
	
	String h_type(String type)
	{
		sc.nextLine();
		System.out.println("enter a hou_type :");
		type = sc.nextLine();
		return type;
	}
	public static void main(String[] args) {
		House h = new House();
		String h1 = h.owner_name("");
		long l1 =h.h_Number(0);
		double d1 = h.h_Price(0);
		int a1 = h.age(0);
		String s2 = h.h_type("");
		
		System.out.println(h1);
		System.out.println(l1);
		System.out.println(d1);
		System.out.println(a1);
		System.out.println(s2);
	
	}

}
