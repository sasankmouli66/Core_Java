package com.methods;

import java.util.Scanner;

public class All_Methods {

	static Scanner sc = new Scanner(System.in);
	int manufacturing_year;
	int age;

		String  model()
		{
			System.out.println("Enter a Model :");
			String name = sc.nextLine();
			return name;
		}
		
		int mafacturing_year()
		{
			System.out.println("Enter a mafacture year:");
			int manufacturing_year  = sc.nextInt();
			return manufacturing_year;
		}
		
		double mileage()
		{
			System.out.println("Enter a millage :");
			double mileage = sc.nextDouble();
			return mileage;
		}
		
		double fuel()
		{
			System.out.println("Enter fuel Requierd :");
			double fuel = sc.nextDouble();
			return fuel;	
		}
		
		int Car_age2()
		{
			
			return 2026-mafacturing_year();
		}
		
		boolean service(double mileage )
		{
			System.out.println("check service Availablity");
			if(mileage >= 500)
			{
				System.out.println("Eligible for Service");
				return true;
			}
			else
			{
				System.out.println("Not Eligible");
				return false;
			}
		}
//		////////////////  Student Details //////////////////////////
		static int total1;
		static int Total;
		static double percentage;
		
		static void Name(String name)
		{
			System.out.println("Enter a name   :"+ name );
//			String name = sc.nextLine();
		}
		
		static void id(int Id )
		{
			System.out.println("Enter your Id  :"+ Id);
//			int  Id = sc.nextInt();
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
}