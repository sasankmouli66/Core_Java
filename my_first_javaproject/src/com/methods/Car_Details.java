 
package com.methods;

import java.util.Scanner;

public class Car_Details extends All_Methods {
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
	public static void main(String[] args) {
		Car_Details c  = new Car_Details();
		String car = c.model();
		int year = c.mafacturing_year();
		double Fuel = c.fuel();
		int car_Age = c.Car_age2();
		double mileage = c.mileage();
		boolean Service = c.service(mileage);
		sc.nextLine();
		
		System.out.println("Car Name           :  "+car);
		System.out.println("Manufacturing year :  "+ year);
		System.out.println("Fuel Requiered     :  "+Fuel);
		System.out.println("Car Age            :  "+car_Age);
		System.out.println("Millage            :  "+mileage);
		System.out.println("Service            :  "+ Service);
	}

}
