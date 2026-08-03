package com.javaintro;

public class MoviesTickets {
	static String TheaterName = "Arjun Theaters";
	static String TheaterName2 = "Lulu Theaters";
	int TicketId;
	String Movie;
	int SeatNo;
	char seatNo;
	String BookingStatus;
	int AvailableTickets;	
	void bookTickets()
	{
		AvailableTickets--;
		displayDetils();
	}
	
	void displayDetils()
	{
		System.out.println("Ticket Id :"+TicketId);
		System.out.println("Movie Name :"+ Movie);
		System.out.println("Seat No :"+ SeatNo);
		System.out.println("Seat Row :"+ seatNo);
		System.out.println("Booking Status :"+ BookingStatus);
		System.out.println("Available Tickets : "+ AvailableTickets);
	}

	public static void main(String[] args) {
		MoviesTickets t1 = new MoviesTickets();
		System.out.println(TheaterName);
		t1.TicketId = 1;
		t1.Movie = "Varnasi";
		t1.SeatNo = 6;
		t1.seatNo = 'B';
		t1.BookingStatus = "Confirmed";
		t1.AvailableTickets = 8;
		t1.bookTickets();
		System.out.println("Ticket Booked in Vrnasi Movie");
		System.out.println("----------------------------------------------");
		System.out.println("----------------------------------------------");
		System.out.println(TheaterName2);
		MoviesTickets t2 = new MoviesTickets();
		t2.TicketId = 2;
		t2.Movie = "Spider Man Brand New Day";
		t2.SeatNo = 12;
		t2.seatNo = 'G';
		t2.BookingStatus = "Cancelled";
		t2.AvailableTickets = 25;
		t2.bookTickets();
		System.out.println("Ticket Booked in Spider Man Brand New Day Movie");
		System.out.println("----------------------------------------------");
		System.out.println("----------------------------------------------");	
		t1.bookTickets();
	}

}
