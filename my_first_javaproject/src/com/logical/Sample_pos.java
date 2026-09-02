package com.logical;
import java.util.Scanner;
public class Sample_pos {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Marriage Pofirle Buro....!");
	System.out.println("--------------------------------------------");
	System.out.println("Hello What's a your name");
	String name = sc.nextLine();
	System.out.println("Hello sir My Name Is "+name +",Have a nice day");
	
	System.out.println("Enter your Asserts");
	double asserts = sc.nextDouble();
	
	System.out.println("Enter your Salary");
	double sal = sc.nextDouble();
	
	if (asserts >= 50000000.00 && sal >= 2500000.00)
	{
		System.out.println("Will Continue Discussion....");
		
		System.out.println("Enter a age ");
		int age = sc.nextInt();
		if(age >= 21 && age <= 29)
		{
			System.out.println("Oh your Age is match...");
			
			System.out.println("Enter your Height");
			double height = sc.nextDouble();
			if (height >= 5.6 && height <= 6.1){
				System.out.println("So your Height also Match");
				
				System.out.println("Dou U have any Sibiling");
				boolean simbling = sc.hasNext();
				if(!simbling)
				{
					System.out.println("Great u r Perfectly Match");
				}
				else
				{
					System.out.println("Your not Match This Profile");
				}
			}
			else
			{
				System.out.println("Sorry Your height not Match");
			}
		}
		else
		{
			System.out.println("Sorry! your age Not Match");
		}
	}
	else
	{
		System.out.println("Sorry We can leave Conversion");	
	}

	}

}
