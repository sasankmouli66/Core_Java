package com.javaintro;

public class Movies {
	
	String MovieName;
	String Hero;
	int year;
	
	static String Language = "Telugu";
	static String Industry = "Hyderabad";

	public static void main(String[] args) {
		
	Movies movie = new Movies();
	movie.MovieName = "varnasi";
	movie.Hero = "Mahesh";
	movie.year = 2027;
	System.out.println("------------Obj1--------------");
	System.out.println("MovieName =" + movie.MovieName);
	System.out.println("Hero ="+ movie.Hero);
	System.out.println("year =" + movie.year);
	System.out.println(Language);
	System.out.println(Industry);
	
	String Language = "All Language Dubbed";
	String Industry = "Mumabai";
	Movies movie1 = new Movies();
	movie1.MovieName = "RRR";
	movie1.Hero = "NTR & Ram Charan";
	movie1.year = 2025;
	System.out.println("------------Obj2--------------");
	System.out.println("MovieName =" + movie1.MovieName);
	System.out.println("Hero ="+ movie1.Hero);
	System.out.println("year =" + movie1.year);
	System.out.println(Language);
	System.out.println(Industry);
	}

}
