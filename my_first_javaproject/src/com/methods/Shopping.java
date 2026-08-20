//•	Product name → String 
//•	Product quantity → int 
//•	Product price → double 
//•	Discount amount → double 
//•	Final bill → double 
//•	Discount eligible → boolean 

package com.methods;

import java.util.Scanner;

public class Shopping {
	int qty;
	double price;
	double discount;

	void product_Name(String name) {
		
		System.out.println("Poduct Name     :"+name);
	}

	void quantity(int qty) {
		System.out.println("Product qyanty :"+qty);
	}

	void product_Price(double price) {
		System.out.println("Price          :"+price);
	}

	void discount(double discount) {
		System.out.println("Discount       :"+discount);
	}

	void total(double price,double discout,int qty) {
		double total = price * qty;
		double discount_amount = (total * discount) / 100;
		double total_amount = total - discount_amount;
		System.out.println(total);
		System.out.println(discount_amount);
		System.out.println(total_amount);
		
	}

	void bill() {
		
		System.out.println("Add to Cart Sucessfully");
		System.out.println("---------------------------------------");
		System.out.println("Conform Oredr ");	
	}

	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
		Shopping s = new Shopping();
		s.product_Name("mouli");
		s.quantity(2);
		s.product_Price(2000);
		s.discount(15);
		s.total(2000,15,2);
		s.bill();
	}

}
