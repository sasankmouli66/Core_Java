package com.logical;

import java.util.Scanner;

public class Fritus_vegetables_Pos {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String items;
	String yes;
	double totalVeg = 0;
	double totalFru = 0;
	do {
	System.out.println("Enter a vegetables & fruits :");
	items = sc.nextLine();
	switch(items) 
	{
	case"fruits"->{
		String yn;
		double total_Amount = 0;
		do {
		System.out.println("Enter a Fruits :");
		String fruits = sc.nextLine();
		System.out.println("Enter qty");
		int qty = sc.nextInt();
		switch(fruits) {
		
		case "mango"->
		   {
			System.out.println("Mango Price is 70");
			total_Amount = total_Amount + 70*qty;
		   }
		case "apple"->
			{
			System.out.println("Apple Price is 100");
			total_Amount = total_Amount + 100*qty;
			}
		case "guava"->
			{
			System.out.println("gauava Price is 30");
			total_Amount = total_Amount + 30*qty;
			}
		case "berry"->
			{
			System.out.println("Star Berry Price is 60");
			total_Amount = total_Amount + 60*qty;
			}
		default ->
			{
			System.out.println("Invalid Fruit name");
			}
		}
		System.out.println("Continue u can enter yes and no");
		yn = sc.nextLine();	
	}while (yn.equalsIgnoreCase("yes"));
		totalVeg = total_Amount;
		System.out.println("Total Amount Fruits_:"+totalVeg);
//		System.out.println("Exists");	
	}
	
	case "vegetables"->{
		double total_Amount = 0;
		String yn;
		do {
		System.out.println("Enter vegetables");
		String vegetables = sc.nextLine();
		System.out.println("Enter qty");
		int qty = sc.nextInt();
		switch(vegetables) {
				case"potato"->{
					System.out.println("Potato is 60");
					total_Amount = total_Amount +60*qty;
				}
				case"chili"->{
					System.out.println("chilli is 90");
					total_Amount = total_Amount +90*qty;
				}
				default -> {
					System.out.println("invalid details");
				}
			}
		System.out.println("Can u continue yes and no");
		yn = sc.nextLine();
	}while (yn.equalsIgnoreCase("yes"));
		System.out.println("Exists");
		totalFru = total_Amount;
		System.out.println("Total Amount Vegetables :"+totalFru);
	}
	default ->{
		System.out.println("Invalid Details.....");
	}
	}
	System.out.println("Can u Continue Items Yes and no");
	yes = sc.nextLine();
}while (yes.equalsIgnoreCase("yes"));
	double grand_Total = totalVeg + totalFru;
	System.out.println("Total vegetables :"+totalVeg);
	System.out.println("Total fruits :"+totalFru);
	System.out.println("Fruits & vegetable total Amount :"+grand_Total);
	System.out.println("Exists");
	sc.close();
}
}
