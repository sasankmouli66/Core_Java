//•	Book name → String 
//•	Book ID → int 
//•	Book price → double 
//•	Late fine → double 
//•	Book grade/category → char 
//•	Book available → boolean 

package com.methods;

import java.util.Scanner;

public class Library {
//	static Scanner sc = new scanner(System.in);

	void book_Name(String name) {
		System.out.println("Book Name                     :"+name);
	}
	
	void id(int id)
	{
		System.out.println("Book Id                       :"+id);
	}
	
	void price(double price,double fine)
	{
		System.out.println("Book Price                      :"+ price);
		System.out.println("Book Late fine                  : "+ fine);
		System.out.println("total Book Price with late Fine :"+(price + fine));
	}
	
	void grade(char grade)
	{
		System.out.println("Book Grade                      :" + grade);
	}
	
	public static void main(String[] args) {
		
		Library l = new Library();
		l.book_Name("james");
		l.id(22588);
		l.price(260,60);
		l.grade('A');

	}

}
