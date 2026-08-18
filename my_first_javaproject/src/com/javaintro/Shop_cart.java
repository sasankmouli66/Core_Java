package com.javaintro;

import java.util.Scanner;

public class Shop_cart {
	static Scanner sc = new Scanner(System.in);
	static String store_Name = "Vijeitha Mart";
	String Customer_name;
	String product_Name;
	double Price;
	int quantity;
	
	void add_Product(String name,double Price,int quantity)
	{
		System.out.println("Product Name    :"+name);
		System.out.println("Price           :"+Price);
		System.out.println("Quantity        :"+quantity);
	}
	
	void calculate_Total(double discount)
	{
		double actutal_Price = Price * quantity;
		System.out.println("Total Price     :"+Price);
		double actutal_Discount = actutal_Price - (actutal_Price*discount/100);
		System.out.println("Actual Discount :"+actutal_Discount);
		
	}
	
	void display()
	{
		System.out.println("Store Name      :"+store_Name);
		System.out.println("Customer Name   :"+Customer_name);
		add_Product("Tv",Price,quantity);
		calculate_Total(15);
		
	}
	
	public static void main(String[] args) {
		System.out.println("Main method Started....");
		Shop_cart s = new Shop_cart();
		s.Customer_name = "sai";
		s.Price = 2000;
		s.quantity = 1;		
		s.display();	
	}

}
