//Create a Java class named Employee to manage employee details in an organization. 
//take these variables to provide unique information for 
//employees :-employeeName,
//employeeId, designation, department, salary, remoteLocation 
//
//take these variables common for all:-
//companyName = "Suntech Solutions"
//companyLocation = "Hi-Tech city"
//
//Requirements:
// Create a static block to   display:
//"Welcome to SunTech Solutions!
//Employee HRMS Portal"
//Methods:-
//› displayEmployeeDetails() to display the details of a particular employee.
//› promoteEmployee() to change the employee's designation.
//› updatesalary() to increase the employee's salary by 5000 whenever the method is called.
//>updateEmpLoyeeLocation() to update the location for employee
package com.datatypes;

public class Employee_e {
	int employeeId;
	String empName;
//	String designation;
	String designation;
	String department;
	int Salary;
	String Remote_Location;
	static String Company_Name ="Welcome to SunTech Solutions!";
	
	void emp_Details()
	{
		System.out.println(Company_Name);
		System.out.println("Employee Id      = "+employeeId);
		System.out.println("Emp_Name         = "+empName);
		System.out.println("Designation      = "+designation);
		System.out.println("Department       = "+department);
		System.out.println("Salary           = "+Salary);
		System.out.println("Remote Location  = "+Remote_Location);	
	}
	
	void promte_Emp()
	{
		up_DateSalary();
		update_location();
		designation = "Manger";
		System.out.println("Update designation ="+designation);
	}
	
	void up_DateSalary()
	{
		Salary = Salary + 5000;	
		System.out.println("Update salary ="+Salary);
	}
	
	void update_location()
	{
		Remote_Location = "hyderabad";
		System.out.println("Updat Location :"+Remote_Location);
	}
	public static void main(String[] args) {
		Employee_e e = new Employee_e();
		e.employeeId = 1;
		e.empName = "sai";
		e.designation = "assotive";
		e.department = "java developer";
		e.Salary = 20000;
		e. Remote_Location = "JNTU";
		e.emp_Details();
		System.out.println("---------------------------");
		e.update_location();
		
		System.out.println("**************************");
		Employee_e e1 = new Employee_e();
		e1.employeeId = 2;
		e1.empName = "sai";
		e1.designation = "assotive";
		e1.department = "java developer";
		e1.Salary = 26000;
		e1.Remote_Location = "JNTU";	
		e1.emp_Details();
		System.out.println("----------------------------");
		e1.promte_Emp();
	}

}
