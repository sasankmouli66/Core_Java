package com.constructors;

public class constructor1 {

	String bike;
	String version;
	int year;	
	constructor1()
	{
		bike = "hero";
		version = "p";
		year = 2024;
	}
	constructor1(String bike, String version, int year) 
	{
		this.bike = bike;
		this.version = version;
		this.year = year;
	}
	
	public static void main(String[] args) {
//		in  feature create object manulally
		constructor1 b1 = new constructor1();
		b1.bike = "rr";
		b1.version = "desiel";
		b1.year = 2026;
		b1.show();
		
		constructor1 b = new constructor1("java","petrol",2025);
		b.show();
		
		constructor1 b2 = new constructor1();
		b2.show();
		
	}
	
	void show()
	{
		System.out.println(bike);
		System.out.println(version);
		System.out.println(year);
	}

}
