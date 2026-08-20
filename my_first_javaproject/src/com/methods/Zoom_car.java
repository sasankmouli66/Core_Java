
package com.methods;
import java.util.Scanner;
public class Zoom_car {
	static Scanner sc = new Scanner(System.in);
	
	static String company_Name = "Mytri Travels";
	int day(double day)
	{
		System.out.println("Enter how many days :");
		day = sc.nextInt();
		return (int) day;	
	}
	double rent_Car(double rent)
	{	
		System.out.println("Enter car rent :");
		rent = sc.nextDouble();
		return rent;
	}
	
	double insurance(double insurance)
	{
		System.out.println("Enter a insurance:");
		insurance = sc.nextDouble();
		return insurance;
	}
	
	double rent_Cost(double rent,double insurance,int day)
	{
		double rent_cost_pay = (rent * day)+ insurance;
		return rent_cost_pay;
	}
	
	public static void main(String[] args) {
		
		Zoom_car c = new Zoom_car();
		int day = c.day(0);
		double car_rent = c.rent_Car(0);
		double car_Insurance = c.insurance(0);
		double total_cost = c.rent_Cost(car_rent,car_Insurance,day);
		System.out.println("Company Name         :"+company_Name);
		System.out.println("how many days to use :"+day);
		System.out.println("car rent             :"+car_rent);
		System.out.println("car insurance        :"+car_Insurance);
		System.out.println("total cost           :"+total_cost);
	}

}
