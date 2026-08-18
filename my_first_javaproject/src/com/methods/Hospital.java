//•	Patient name → String 
//•	Patient age → int 
//•	Temperature → double 
//•	Bill amount → double 
//•	Patient category → String 
//•	Emergency case → boolean 

package com.methods;
import java.util.Scanner;
public class Hospital {
static Scanner sc = new Scanner(System.in);
	String patient_Name(String name)
	{
		System.out.println("Enter a name:");
		name = sc.nextLine();
		return name;
	}
	
	int age(int age)
	{
		System.out.println("Enter a age:");
		age = sc.nextInt();
		return age;
	}
	
	double temperature(double temp)
	{
		System.out.println("enter a temp :");
		temp = sc.nextDouble();
		return temp;	
	}
	
	double bill_Amount(double bill)
	{
		System.out.println("enter a bill:");
		bill = sc.nextDouble();
		return bill;
	}
	
	String p_Catageroy(String Catageroy)
	{
		sc.nextLine();
		System.out.println("Enter a Cateory :");
		Catageroy = sc.nextLine();
		return Catageroy;
	}
	
	boolean Emergcy(String catageroy)
	{
		if (catageroy.equalsIgnoreCase("chest pain") ||
			    catageroy.equalsIgnoreCase("heart"))
		{
			System.out.println("Emergency: Urgent cases requiring immediate medical evaluation.");
			return true;
		}
		else
		{
			System.out.println("General Ward");
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		Hospital h = new Hospital();
		String S1 = h.patient_Name("");
		int Age = h.age(0);
		double Temperature = h.temperature(0);
		double Bill = h.bill_Amount(0);
		String category = h.p_Catageroy("");
		boolean Category = h.Emergcy(category);
		
		System.out.println("Patient Name :"+S1);
		System.out.println("Age :"+Age);
		System.out.println("Temperature :"+Temperature);
		System.out.println("Bill :"+ Bill);
		System.out.println("category :"+category);
		System.out.println("Categoroy :"+Category);
	}

}
