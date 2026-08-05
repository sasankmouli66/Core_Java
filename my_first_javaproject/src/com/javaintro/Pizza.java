package com.javaintro;

public class Pizza {
	String pizza;
	String CoolDrinks;
	int TotalCost;
	String ExtraSpincy;
	int pizza2;
	
	int pizza1;
	int CoolDrinks1;
	int Price;
	
	String Address;
	int total;
	
    void addItems()
    {
    	System.out.println("pizza Name : " + pizza +" " + pizza1);
    	System.out.println("Cool Drinks :"+ CoolDrinks + " " +CoolDrinks1 );
    	System.out.println("Extra Spincy : " + ExtraSpincy);
    	System.out.println("Address : "+ Address);
    	//System.out.println("====================="); 	
    }
    
    void count()
    {
    	pizza2--;
    	System.out.println("AvailAble Pizzas : " + pizza2);
    	
    }
    
    void Status()
    {
    	String statu = "Confirmed";
    	System.out.println("Status : "+statu);
    }
    
    void Statu()
    {
    	String statu1 = "Not Conformied";
    	System.out.println("Status : "+statu1);
    }
    
    void displayCart()
    {
    	addItems();
    	TotalCost = pizza1 + CoolDrinks1;
    	System.out.println("Price : "+ TotalCost);
    	Status();
    	System.out.println("=====================");
    	count();
    	
    }

	public static void main(String[] args) {
		Pizza v1 = new Pizza();
		v1.pizza = "Chicken Pizza";
		v1.pizza1 = 250;
		v1.ExtraSpincy = "spicy";
		v1.CoolDrinks = "Cocal Drink";
		v1.CoolDrinks1 = 60;
		v1.pizza2 = 5;
		v1.Address = "Hydersbad, Jntu Metro";
		v1.displayCart();
		
		System.out.println("*******************************");
		System.out.println("*******************************");
		Pizza v2 = new Pizza();
		v2.pizza = "Veg Pizza";
		v2.pizza1 = 200;
		v2.CoolDrinks = "Cocal Drink";
		v2.CoolDrinks1 = 80;
		v2.pizza2 = 10;
		v2.Address = "Hydersbad, Hi Tech City";
		v2.displayCart();
		
		

	}

}
