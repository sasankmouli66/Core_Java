package com.bank_pos;
import java.util.Scanner;
public class Resturant_pos {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	System.out.println("Enter resturant name:");
	String resturant_Name = sc.nextLine();
	double total_nonVeg_cost = 0;
	double total_veg_cost = 0;
	double total_starters_cost = 0;
	String y;
	do {
		System.out.println("Enter Resturant Items");
		String resturent = sc.nextLine();
	double total_Amount = 0;
	switch(resturent) {
	case "nonVeg"->{
				do {
				System.out.println("Select Non Veg Items");
				String items = sc.nextLine();
				System.out.println("Enter quatity");
				int qty = sc.nextInt();
				sc.nextLine();
							switch (items) {
									case "chicken brinary" ->{
										System.out.println("Chicken Brinary = 260");
										total_Amount = total_Amount + 260 * qty;
									}
									case "Chicken Fried Rice" ->{
										System.out.println("Chicken Brinary = 220");
										total_Amount = total_Amount + 220 * qty;
									}
									case "chicken manchuria" ->{
										System.out.println("chicken manchuria = 200");
										total_Amount = total_Amount + 200 * qty;
									}
									case "mutton biryani" ->{
										System.out.println("mutton biryani = 300");
										total_Amount = total_Amount + 300 * qty;
									}
									case "mutton curry" ->{
										System.out.println("muttin curry = 320");
										total_Amount = total_Amount + 320 * qty;
									}
									case "fish fry" ->{
										System.out.println("fish fry = 220");
										total_Amount = total_Amount + 220 * qty;
									}
									case "chicken lollipop" ->{
										System.out.println("chicken lollipo = 200");
										total_Amount = total_Amount + 200 * qty;
									}
									default ->{
										System.out.println("Invalid details");
									}	
								}
				System.out.println("Can u Continue nonVeg Items Enter yes And No");
				y = sc.nextLine();
			}while(y.equalsIgnoreCase("yes"));
				total_nonVeg_cost = total_Amount;
//				System.out.println("Tota_Amount :"+total_nonVeg_cost);
//				System.out.println("Exists");
			}
	case "veg" ->{
		do {
		System.out.println("Select Veg Items");
		String vegItems = sc.nextLine();
		System.out.println("Enter quatity");
		int qty = sc.nextInt();
		sc.nextLine();
					switch (vegItems) {
							case "veg biryani" ->{
								System.out.println("veg biryani  = 100");
								total_Amount = total_Amount + 100 * qty;
							}
							case "veg fried rice" ->{
								System.out.println("veg fried rice = 160");
								total_Amount = total_Amount + 160 * qty;
							}
							case "paneer butter masala" ->{
								System.out.println("paneer butter masala = 200");
								total_Amount = total_Amount + 200 * qty;
							}
							case "panner tikka" ->{
								System.out.println("paner tikka = 220");
								total_Amount = total_Amount + 220 * qty;
							}
							case "veg noodles" ->{
								System.out.println("veg noodles = 120");
								total_Amount = total_Amount + 120 * qty;
							}
							case "dal fry" ->{
								System.out.println("dal fry = 120");
								total_Amount = total_Amount + 120 * qty;
							}
							case "chilli paner" ->{
								System.out.println("chilli paner = 160");
								total_Amount = total_Amount + 160 * qty;
							}	
							default ->{
								System.out.println("Invalid details");
							}	
						}
		System.out.println("Can u Continue veg Items Enter yes And No");
		y = sc.nextLine();
	}while(y.equalsIgnoreCase("yes"));
		total_veg_cost = total_Amount;
//		System.out.println("Tota_Amount :"+total_veg_cost);
//		System.out.println("Exists");
	}
	case "starters" ->{
		do {
		System.out.println("Select Starters Items");
		String sItems = sc.nextLine();
		System.out.println("Enter quatity");
		int qty = sc.nextInt();
		sc.nextLine();
					switch (sItems) {
							case "chicken 65" ->{
								System.out.println("chicken 65  = 180");
								total_Amount = total_Amount + 180 * qty;
							}
							case "chieken wings" ->{
								System.out.println("chicken wings = 200");
								total_Amount = total_Amount + 200 * qty;
							}
							case "chicken kabab" ->{
								System.out.println("chicken kabab = 240");
								total_Amount = total_Amount + 240 * qty;
							}
							case "fish finger" ->{
								System.out.println("fish finger = 200");
								total_Amount = total_Amount + 200 * qty;
							}
							case "chilli chicken" ->{
								System.out.println("chili chicken = 200");
								total_Amount = total_Amount + 120 * qty;
							}
							case "gobi manchuria" ->{
								System.out.println("gobi manchuria = 150");
								total_Amount = total_Amount + 150 * qty;
							}
							default ->{
								System.out.println("Invalid details");
							}	
						}
		System.out.println("Can u Continue Starters Enter yes And No");
		y = sc.nextLine();
	}while(y.equalsIgnoreCase("yes"));
		total_starters_cost = total_Amount; 
//		System.out.println("Total Amount Starters:"+total_starters_cost);
//		System.out.println("Exists");
	}
	default ->{
		System.out.println("Invalid details");
	}
	}
	System.out.println("Can u Continue Enter yes & not Enter no");
	y = sc.nextLine();
	}while(y.equalsIgnoreCase("yes"));
		System.out.println(" thank for visit "+resturant_Name+" resturant");
		System.out.println("------------------------------------------");
		System.out.println("Total Amount non-Veg Cost :"+total_nonVeg_cost);
		System.out.println("Total Amount Veg Cost     :"+total_veg_cost);
		System.out.println("Total Amount Starters     :"+total_starters_cost);
		double resturant_Bill = total_nonVeg_cost + total_veg_cost + total_starters_cost;
		System.out.println("Resturant Bill :"+resturant_Bill);
		System.out.println("Thank you....");
		sc.close();
	}
	}
	
