package com.javaintro;

public class Bike {
	String bikeName;
	String startBike = "Bike Start";
	String stopBike = "Bike Stop";
	
	static String CompanyName ="Hero Honda";
	static int SpeedLimit =82;
	void RunningBike()
	{
		System.out.println("Bike Name = "+ bikeName);
		System.out.println(startBike);
		System.out.println(stopBike);
	}
	
	static void Company() 
	{
		System.out.println("Company Name =" + CompanyName);
		System.out.println("Speed Limit =" + SpeedLimit + "khm/hr");
		
	}

	public static void main(String[] args) 
	{
		Bike obj = new Bike();
		obj.RunningBike();
		Bike.Company();
		System.out.println("----------oj------------");
		Bike obj2 = new Bike();
		obj2.bikeName = "bajaj";
		obj.RunningBike();
		Bike.Company();
		System.out.println("----------oj------------");
		
		Bike obj3 = new Bike();
		obj3.bikeName = "pulser";
		obj3.CompanyName = "bajaj";
		int SpeedLimit =25;
		System.out.println(SpeedLimit);
		System.out.println(CompanyName);
	}
	

}
