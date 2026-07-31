package com.javaintro;

public class Library {
	static String librayNme = "Vcube";
	static String librayIncharge = "Jeevan Sir";
	int BookId;
	String BookName;
	String AuthourName;
	int AvailableCopies;
	
	static void updateLibrary()
	{
		System.out.println("libray Nme : "+librayNme);
		System.out.println("libray Incharge : "+librayIncharge);
	}
	
	void BookDetails()
	{
		System.out.println("Book Id : " + BookId);
		System.out.println("Book Name : "+ BookName);
		System.out.println("Authour Name : " + AuthourName);
		System.out.println("Available Copies : " + AvailableCopies);
	}
	
	void IssuseCopies()
	{
		
		AvailableCopies--;
		BookDetails();
	}
	
	
	public static void main(String[] args) {
		Library l1 = new Library();
		l1.BookId = 101;
		l1.BookName = "Physics";
		l1.AuthourName = "Ratnakar";
		l1.AvailableCopies = 3;
		updateLibrary();
		l1.IssuseCopies();
		System.out.println("---------------------------------");
		
		Library l2 = new Library();
		l2.BookId = 102;
		l2.BookName = "Maths";
		l2.AuthourName = "Sunil";
		l2.AvailableCopies = 5;
		librayIncharge = "Aditya";
		updateLibrary();
		l2.IssuseCopies();
		System.out.println("==================================");
		Library l3 = new Library();
		l3.BookId = 103;
		l3.BookName = "Social";
		l3.AuthourName = "Sai";
		l3.AvailableCopies = 7;
		updateLibrary();
		l3.IssuseCopies();
		System.out.println("**********************************");
		
		updateLibrary();
		l3.IssuseCopies();
		
	}

}
