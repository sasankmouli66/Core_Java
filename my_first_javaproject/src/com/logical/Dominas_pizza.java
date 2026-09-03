//Create a Java program to calculate a customer's pizza bill based on pizza 
//size, quantity, and delivery distance.
//Requirements:
//S → 70
//M → 100
//L→150
//Create the following methods:
//double getpizzaPrice(char size) → Return the pizza price based on the 
//selected size.
//doublecalculatepizzacost(double price, int quantity) → Return the total 
//pizza cost based on price and quantity. 
//doublecalculateDeliverycharge(double distance)
// > Return delivery charge: 0-10 km = 70rs, "11-20 km = 100, >20 km = 150.
//doublecalculateFinalBill(double pizzacost, double deliverycharge) → 
//Return the final bill by adding pizza cost and delivery charge.
//Ask the user for:
//Pizza size ('S/M/L),
//Quantity,
//Delivery distance.

package com.logical;
import java.util.Scanner;
public class Dominas_pizza {
	
	public static void  main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Dominas_pizza d = new Dominas_pizza();
	System.out.println("Enter a size");
	char size = sc.next().charAt(0);
	
	System.out.println("Enter a quantity");
	int quantity = sc.nextInt();
	
	System.out.println("Enter a Distance delivery");
	double dist = sc.nextDouble();
	
	double pizza_Price = d.getpizzaPrice(size);
	double calculate  = d.calculatepizzacost(pizza_Price,quantity);
	double distancePrice = d.delivert_Charge( dist);
	double final_Bill = d.finalBill(calculate, distancePrice);
	
	System.out.println("-------------------------------");
	System.out.println("Size of Pizza :"+pizza_Price);
	System.out.println("total Amount  :"+calculate);
	System.out.println("total Distance:"+distancePrice);
	System.out.println("total Final bill:"+final_Bill);
	
	sc.close();
	}

	double getpizzaPrice(char size)
	{
		double price =0;
		if(size == 's')
		{
			price = 70;
		}
		else if(size == 'm')
		{
			price = 100;
		}
		else if(size == 'l')
		{
			price = 150;
		}
		else
		{
			System.out.println("invalid size");
		}
		return price;
	}
	
	double calculatepizzacost(double price, int quantity)
	{
		double total = price * quantity;
		return total;
	}
	
	double delivert_Charge(double dist)
	{
		double delivery_Charge = 0;
		if(dist < 10)
		{
			delivery_Charge = 10;
		}
		
		else if(dist < 20)
		{
			delivery_Charge = 30;
		}
		else if(dist < 40)
		{
			delivery_Charge = 60;
		}
		else if(dist < 75)
		{
			delivery_Charge = 100;
		}
		else 
		{
			System.out.println("Sorry Distance Not yet delivered");
		}
		return delivery_Charge;
	}
	double finalBill(double total,double delivery_Charge)
	{
		total = total + delivery_Charge;
		return total;
	}

}
