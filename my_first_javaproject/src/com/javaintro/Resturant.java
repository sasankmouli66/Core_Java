//Today task
//Java
//Create a Java class to represent a restaurant table. Implement methods to reserve a table, cancel a reservation, and display the table details.
//
//Requirements:
//take below fields are different for every table,
//a) tableNumber - stores the table number.
//b) seats - Stores the seating capacity of the table.
//c) reserved - Stores whether the table is reserved or not.
//
//Take Below values are common for all tables,
//a) restaurantName - Stores the name of the restaurant.
//
//Instance Methods :-
//a) reserveTable() - Changes the reservation status to reserved.
//b) cancelReservation() - Cancels the reservation.
//c) displayTableDetails() - Displays all the table information, including the restaurant name.



package com.javaintro;

public class Resturant {
	static String restirant = "VSM Resturant";
	int TableId;
	int Seats;
	String Reserved;
	String CancelReserved;
	
	void displayDetails()
	{
		System.out.println("Resturant Name : " + restirant);
		System.out.println("Table Id : " + TableId);
		System.out.println("Seats No : "+Seats);
		
	}
	
	void reserveTable()
	{
		Reserved = "Not Reserved";
		displayDetails();
		System.out.println("Reserved : "+ Reserved);
	}
	
	void cancelReservation()
	{
		CancelReserved = "Reserved Cancelled";
		displayDetails();
		System.out.println("CancelReserved : "+ CancelReserved);
	}
	

	public static void main(String[] args) {
		Resturant R1 = new Resturant();
		R1.TableId = 101;
		R1.Seats = 4;
		R1.reserveTable();
		System.out.println("*******************************");
		Resturant R2 = new Resturant();
		R2.TableId = 102;
		R2.Seats = 5;
		R2.cancelReservation();
		System.out.println("*******************************");
		restirant = "Mouli";
		R2.TableId = 103;
		R2.Seats = 6;
		R2.cancelReservation();
		
	}

}
