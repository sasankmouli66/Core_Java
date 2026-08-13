package com.javaintro;

public class watch_Time {
	String Brand_Name;
	String Watch_Type;
	int hours;
	int Minitues;
	int Seconds;
	int Price;
	
	void Update_Hours()
	{	
		hours++;
		if(hours>=24)
		{
			hours = 0;
			Update_Hours();
		}
	}
	void Update_Minitues()
	{
		Minitues = Minitues+5;
		if(Minitues >= 60)
		{
			Minitues = Minitues % 60;
			Update_Minitues();
		}
	}
	
	void update_Seconds()
	{
		Seconds++;
		if(Seconds >= 60)
		{
			Seconds = 0;
			update_Seconds();
		}
	}
	
	void Display_time()
	{
		Update_Hours();
		Update_Minitues();
		System.out.println("Time = "+hours +":"+Minitues +":"+Seconds);	
		
	}
	
	void Display_Watch_Details()
	{
		System.out.println("Brand Name ="+Brand_Name);
		System.out.println("Watch Type  ="+Watch_Type);
		System.out.println("Your Time is Updated..");
		Display_time();
		
	}
	
	public static void main(String[] args) {
		watch_Time c = new watch_Time();
		c.Brand_Name = "Tittan";
		c.Watch_Type = "Anlog";
		c.Price = 5000;
		c.hours = 25;
		c.Minitues = 45;
		c.Seconds = 6;
		c.Display_Watch_Details();
		System.out.println("------------------------------");
		watch_Time c1 = new watch_Time();
		c1.Brand_Name = "Fast Track";
		c1.Watch_Type = "Digital";
		c1.Price = 2500;
		c1.hours = 15;
		c1.Minitues = 30;
		c1.Seconds = 25;
		c1.Display_Watch_Details();
	}

}
