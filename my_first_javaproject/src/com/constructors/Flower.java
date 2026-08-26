package com.constructors;

public class Flower{
	String Name="Jasmine";
	String color="white";
	{
		System.out.println("hiiiiiiiiii");
	}
	Flower(){
		System.out.println("Parent class called:");
	}
}
 class Rose extends Flower{
	 String Name="Rose";
	 String color="Red";
	 {
		 System.out.println("Ratnakar");
	 }
	 Rose(){
		 System.out.println("Child class called");
	 }
	public static void main(String []args) {
		Rose r = new Rose();
		
		r.flowerInfo();
	}
	void flowerInfo() {
		System.out.println("FlowerName:"+Name);
		System.out.println("color:"+color);
		System.out.println("FlowerName:"+super.Name);
		System.out.println("color:"+super.color);
	}
}
