
package com.datatypes;
import java.util.Scanner;

public class Test_methods2 {
	static void student(String name, int age)
	{
		System.out.println("========= BOOK DETAILS ===============");
		System.out.println("Enter student Name   : "+name);
		System.out.println("Enter student age    : "+age);	
	}
	static void book(String name1, String author)
	{
		System.out.println("Enter Book Name      : "+ name1);
		System.out.println("Enter  Authour Name  : "+  author);	
	}
	
	static void employes_Details(String name2,int age1 ,double salary, 
			 float height,String city, String state)
	{
		System.out.println("========== EMPLOYE DETAILS ============");
		System.out.println("Employe Name        :"+ name2);
		System.out.println("Age                 :"+age1);
		System.out.println("Salary              :"+salary);
		System.out.println("Height              : "+height);
		System.out.println("city                :"+city);
		System.out.println("Stat                :"+ state);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter sid name :");
		String name = sc.nextLine();
		
		System.out.print("Enter age :");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter a name1 :");
		String name1 = sc.nextLine();
		
		System.out.print("Enter a authour :");
		String authour = sc.nextLine();
		
		String name2 = sc.nextLine();
		int age1 =sc.nextInt();
		double salary = sc.nextDouble();
		float height = sc.nextFloat();
		sc.nextLine();
		String city = sc.nextLine();
		String state = sc.nextLine();
		
		
		student(name,age);
		book(name1,authour);
		employes_Details(name2,age1, salary, height, city,  state);
		
	}
}
