//.Write a Java program to take Variables as EmployeeName , 
//Salary, and CompanyName 
//
//Pass the values while creating an object and assign the local 
//values to class level data members 
//
//Take the display method to display each object data 

package com.constructors;

public class Emp_details {
	String EmployeName;
	int salary;
	String companyName;

	Emp_details(String EmployeName, int salary, String companyName) {
		this.EmployeName = EmployeName;
		this.salary = salary;
		this.companyName = companyName;
	}

	public static void main(String[] args) {

		Emp_details e = new Emp_details("Sunil",50000,"Accenture");
		e.show();
	}

	void show() {
		System.out.println("Emp Name   :" + EmployeName);
		System.out.println("salary     :" + salary);
		System.out.println("companyName:" + companyName);
	}
}
