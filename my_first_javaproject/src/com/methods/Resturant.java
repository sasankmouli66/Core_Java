
package com.methods;
import java.util.Scanner;
public class Resturant {
Scanner sc = new Scanner(System.in);
	void customer_Name(String name)
	{
		System.out.println("enter customer name :"+name);
	}
	
	void number_Items(int items)
	{
		System.out.println("Items               :"+items);	
	}
	
	void food_price(double price)
	{
		System.out.println("total a price       :" + price);		
	}
	
	void gst(double gst)
	{
		System.out.println("Double Gst          :"+gst);
	}
	
	double gst(double gst,double price)
	{
		double gstAmount = (gst * price) / 100;
		return gstAmount;
	}
	
	double final_bill(double price)
	{
		return price;
	}
	
	double total_pay(double gstAmount,double price)
	{
		double Amount = gstAmount + price;
		return Amount;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Resturant r = new Resturant();
		System.out.println("Enter a name:");
		String name = sc.nextLine();
		
		System.out.println("enter items:");
		int items = sc.nextInt();
		
		System.out.println("Enter price :");
		double price = sc.nextDouble();
		
		System.out.println("Enter gst:");
		double gst = sc.nextDouble();
		
		double gstAmount = r.gst(gst,price);
		double fina_bill = r.final_bill(price);
		double total_Amount = r.total_pay(gstAmount,price);
		
		r.customer_Name(name);
		r.number_Items(items);
		r.food_price(price);
		r.gst(gst);
		System.out.println("Calculate Gst Amount   :"+gstAmount);
		System.out.println("Total food items Bill  :"+fina_bill);
		System.out.println("Total Amount with Gst  :"+total_Amount);	
	}

}
