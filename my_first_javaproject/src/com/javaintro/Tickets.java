package com.javaintro;

public class Tickets {
	static String TrainName = "Vande Bharat Express";
	static int Update_total_Tickets;
	static int total_Tickets;
	int overal_sum;
	int Ticket_Amount;
	String Passnger_Name;
	int age;
	String Source;
	String Destination;
	int Number_of_Tickets;
	int Update_Amount; 
	
	void Book_ticket()
	{
		Ticket_Amount = 500;
		int Calcute_Ticket_Amount = Number_of_Tickets * Ticket_Amount;
	    System.out.println("Total Ticket Amount = "+Calcute_Ticket_Amount);
	    int Update_Amount = Calcute_Ticket_Amount;
	    System.out.println("Total Update Amount = "+Update_Amount);
	    total_Tickets  =  total_Tickets+Number_of_Tickets;
	     
	}
	void display()
	{
		System.out.println("Train Name        = "+TrainName);
		System.out.println("Passager Name     = "+Passnger_Name);
		System.out.println("Age               = "+age);
		System.out.println("Sourec            = "+Source);
		System.out.println("Destination       = "+Destination);
		System.out.println("Number_of_Tickets = "+Number_of_Tickets);
		Book_ticket();
		System.out.println("____________________________");
		System.out.println("Thank u for Booking Vandha Bharat ");
		System.out.println("Total tickets = "+total_Tickets);
	}
	void sum()
	{
		overal_sum = total_Tickets * Ticket_Amount;
		System.out.println("Overal Sum Tickets Total = "+overal_sum);
	}
	
	public static void main(String[] args) {
		System.out.println("=========Train Tickets============");
		Tickets t = new Tickets();
		t.Passnger_Name = "Mouli";
		t.age = 23;
		t.Source = "Rajamundry";
		t.Destination = "Hyderabad";
		t.Number_of_Tickets = 2;
		t.display();
		
		System.out.println("===================================");
		Tickets t1 = new Tickets();
		t1.Passnger_Name = "Sai";
		t1.age = 20;
		t1.Source = "Karela";
		t1.Destination = "Hyderabad";
		t1.Number_of_Tickets = 7;
		t1.display();
		System.out.println("__________________________________");
		t1.sum();
		
	}

}
