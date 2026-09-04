//1. Create a Java program to fulfill the following requirements:
//› Create a Vehicle class with a field type and a one-argument constructor accepting type.
//› Create a Car class that extends Vehicle,
//brand and price, and a three-argument constructor accepting type, brand, and price.
// > Create an ElectricCar class that extends Car, with a field batteryCapacity and a four-argument constructor 
//accepting type, brand, price, and batteryCapacity.
//>  In the ElectricCar class, create an object by passing all four values.
//› The values should be passed from Electriccar to Car, and from Car to Vehicle through constructor chaining.
//› Create a display() method inside
//Electriccar and print type, brand, price, and batterycapacity.

package com.constructors;

class vehicle {
	String type;

	vehicle(String type) {
		this.type = type;
	}
}
class car extends vehicle {
	String model;
	double price;

	car(String type, String model, double price) {
		super(type);
		this.model = model;
		this.price = price;
	}

}

public class electric extends car {
	
	int battery;
	electric(String type, String model, double price,int battery)
    {
		super(type,model,price);
		this.battery=battery;
    }
	public static void main(String[] args) {
		System.out.println("main method staeted");
		electric s = new electric("car","tayota",250000,10000);
		s.show();
		
//		electric s1 = new electric(s);
//		s1.show();
		
	}
	 void show()
	{
		System.out.println("type    :"+type);
		System.out.println("car name:"+model);
		System.out.println("price   :"+price);
		System.out.println("battrey :"+battery +" units");
	}
	
}
