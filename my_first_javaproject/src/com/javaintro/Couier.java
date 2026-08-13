package com.javaintro;

public class Couier {
	static int totalCouiers;
	static double totalWeight;
	static double totalAmount_Collected;
	static double Price_KG = 100;
	String Customer_Name;
	int Courier_Id;
	String Source;
	String Destination;
	double weight;
	double Delivery_Amount;
	int total_Nuumber_couriers;
	int total_weight;
	int total_Amount;
	
	static void Main()
	{
		System.out.println("Welcome to Quickship Courier.....!");
	}
	
	void book_Courier()
	{
		Delivery_Amount = weight * Price_KG;
		total_Nuumber_couriers++;
		total_weight += weight;
		totalAmount_Collected += Delivery_Amount;
	}
	
	void today_collection()
	{
		System.out.println("totalCouiers           ="+ total_Nuumber_couriers);
		System.out.println("totalWeight            ="+ total_weight);
		System.out.println("totalAmount_Collected  ="+totalAmount_Collected);
		System.out.println("Delivery_Amount        ="+ Delivery_Amount);
		System.out.println("---------------------------------");
		System.out.println("Sucessfully Booking Confirmed..!");
	}
	
	void display()
	{
	System.out.println("Courier_Id        ="+Courier_Id);	
	System.out.println("Customer_Name     ="+Customer_Name);
	System.out.println("weight            = "+weight);
	System.out.println("Source            ="+Source);
	System.out.println("Destination       ="+Destination);
	book_Courier();
	today_collection();
	
	}
	
	public static void main(String[] args) {
	Main();
	Couier t = new Couier();
	t.Courier_Id = 1;
	t.Customer_Name = "james";
	t.weight = 5f;
	t.Source = "Jntu";
	t.Destination = "Hyderabad";
	t.display();	

	}

}
