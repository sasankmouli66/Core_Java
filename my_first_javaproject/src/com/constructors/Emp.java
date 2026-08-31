//Create a Java program to implement an Employee Login Access System.
//Create a class Employee with the following fields: employeeName, salary, doorpower, blocked
//
//Initialize all the values using a parameterized constructor.
//Create a method checkAccess() that performs the following checks:
//› check whether the door has power or not using a logical/relational expression.
//› Check whether the employee is blocked or not.
//›The employee should get access only when the door has power and the employee is not blocked. 
// > Display the employee name, salary, door power status, blocked status, and the final access status.
package com.constructors;

public class Emp {
	String emp_Name;
	double sal;
	boolean doorpower;
	boolean blocked;
	String status;

	boolean checkAccess() {
		return doorpower && blocked ;
	}

	Emp(String emp_Name, double sal, boolean doorpower, boolean blocked) {
		this.emp_Name = emp_Name;
		this.sal = sal;
		this.doorpower = doorpower;
		this.blocked = blocked;
	}

	public static void main(String[] args) {

		Emp e = new Emp("james", 50000, true, true);
		e.show();
	}

	void show() {
		System.out.println("Name Emp :"+emp_Name);
		System.out.println("Salary   :"+sal);
		System.out.println("access   :" + checkAccess());
	}

}
