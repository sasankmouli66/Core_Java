package com.javaintro;

public class car {

	// instance vaiables
	String car_model;
	int year;

	// static variables
	static String version = "petrol";
	static Float lit = 3.5f;

	// main method
	public static void main(String[] args) {
		////intialization the static variables
		String car_model = "suzki";
		int year = 2025;
		System.out.println("which is your favorite car....");
		System.out.println(version);
		System.out.println(lit);
		// Acessing the variables in static
		System.out.println(car_model);
		System.out.println(year);
		
		/// create a Object
		
		car Tata = new car();
		Tata.car_model = "tata tigio ";
		Tata.year = 2025;
		/////////local variables//////
		String version = "Desiel";
		Float lit = 3.0f;
		
		System.out.println("---------------Obj1----------------");
		System.out.println("Tata car_model ="+ Tata.car_model);
		System.out.println("year =" + Tata.year);
		System.out.println(version);
		System.out.println(lit);
		
		car toyata = new car();
		toyata.car_model = "Fortunuer ";
		toyata.year = 2027;
		////String version = "cng";
		//Float lit = 3.0f;
		System.out.println("---------------Obj2----------------");
		System.out.println("toyata car_model ="+ toyata.car_model);
		System.out.println("year =" + toyata.year);
		System.out.println(car.version);
		System.out.println(car.lit);
		
		

	}

}
