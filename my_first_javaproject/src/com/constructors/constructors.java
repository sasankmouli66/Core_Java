package com.constructors;

public class constructors {
	int carid;
	String car_name;
	int year;
	
	constructors()
	{
		carid = 101;
		car_name = "tata";
		year = 2020;
		
	}
	
	public static void main(String[] args) {
		constructors c = new constructors();
		c.show();
		
		constructors c1 = new constructors();
		c1.show();

	}
	void show() {
		System.out.println("Car Id:"+carid);
		System.out.println("Car Name:"+car_name);
		System.out.println("Year :"+year);
	}

}
