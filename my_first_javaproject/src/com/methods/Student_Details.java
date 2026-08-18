
package com.methods;
import java.util.Scanner;
 
public class Student_Details extends All_Methods {
static Scanner sc = new Scanner(System.in);
static int total1;
static int Total;
static double percentage;

	static void Name(String name)
	{
		System.out.println("Enter a name   :"+ name );
//		String name = sc.nextLine();
	}
	
	static void id(int Id )
	{
		System.out.println("Enter your Id  :"+ Id);
//		int  Id = sc.nextInt();
	}
	
	static void total()
	{
		System.out.println("enter mark all sub....");
		int telugu = 90;
		int hindi = 70;
		int english = 62;
		total1 = telugu + hindi + english;
		System.out.println("Total Marks :"+ total1);
		percentage(total1);
	}
	
	static void percentage(int total)
	{
		double percentage = (total1 /300.0) * 100;
		System.out.println("Total Percentage : "+ percentage);
		grade();
		
	}
	
	static void grade()
	{
		if(total1 > 240)
		{
			System.out.println("A Grade ");
		}
		else if(total1 > 120)
		{
			System.out.println("B Gdarde");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name :");
		String name = sc.nextLine();
		
		System.out.println("enter a Id :");
		int Id = sc.nextInt();
		Name(name);
		id(Id);
		total();
	}

}
