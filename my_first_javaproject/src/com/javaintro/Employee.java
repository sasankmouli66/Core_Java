package com.javaintro;
//1. James works as an employee in a company and earns a monthly salary of 5,000.
//Every month:
//3% of his salary is deducted as GST.
//
//2% of his salary is deducted
//as Provident Fund (PF).
//
//Create the following
//Variables:
//Employee Name, Monthly Salary, Monthly GST, Monthly PF, Net Monthly Salary 
//
//Annual GST, Annual PF, Annual Net Salary.
//
//for Every Individual Calculation take Separate Method as Below.
//
// > calculateMonthlyPF()
// > calculateMonthlyGST(),
//  calculateNetMonthlysalary() > calculateAnnualGST()
// > calculateAnnualPE() ,  > calculateAnnualnetsalary()
// > displayEmployeeDetails()
//
//Task:
//1. Write a Java program to:
//Store the employee details.
//› calculate the monthly GST deduction ,PF deduction.
//› Calculate the net monthly salary after deductions.
//› Calculate the total GST deducted in one year.
//› calculate the total PF deducted in one year.
//› calculate the annual net salary after deductions.
//After the Above Calculations
//Display all the employee and salary details.
public class Employee {
	int EmployId;
	String EmpName;
	double EmpSal;
	double MonthlyPf;
	double MonthlyGst;
	double NetMonthly_Sal;
	double AnnualGst;
	double Annualpf;
	double AnnualNet_sal;
	
	void calculateMonthlyPF() {
		MonthlyPf = EmpSal*2/100;
	}
	void calculateMonthlyGST() {
		MonthlyGst = EmpSal*3/100;
	}
	void calculateNetMonthlysalary() {
		NetMonthly_Sal = EmpSal - MonthlyPf - MonthlyGst;
	}
	void calculateAnnualGST() {
		AnnualGst = MonthlyGst * 12;
	}
	void calculateAnnualPf(){
		Annualpf = MonthlyPf * 12;
	}
	void calculateAnnualnetsalary() {
		AnnualNet_sal = NetMonthly_Sal * 12;
	}
	void display()
	{
		calculateMonthlyPF();
		calculateMonthlyGST();
		calculateNetMonthlysalary();
		calculateAnnualGST();
		calculateAnnualPf();
		calculateAnnualnetsalary();
		displayEmployeeDetails();
	}
	void displayEmployeeDetails() {
		System.out.println("Emp Id : " + EmployId);
		System.out.println("Employe Name : "+EmpName);
		System.out.println("Employ Salary : "+ EmpSal);
		System.out.println("Monthly PF : "+ MonthlyPf);
		System.out.println("Monthly Gst : "+ MonthlyGst);
		System.out.println("NetMonthly Sal : "+ NetMonthly_Sal);
		System.out.println("Annual Gst : "+ AnnualGst);
		System.out.println("Annual pf : "+ Annualpf);
		System.out.println("AnnualNet sal : "+ AnnualNet_sal);
	}
	
	public static void main(String[] args) {
		Employee sc = new Employee();
		sc.EmployId = 101;
		sc.EmpName = "sai";
		sc.EmpSal = 5000;
		sc.MonthlyPf = 5000;
		sc.MonthlyGst = 5000;
		sc.NetMonthly_Sal = 5000;
		sc.display();

	}

}
