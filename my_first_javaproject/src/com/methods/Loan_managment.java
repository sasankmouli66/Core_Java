//Create a Class Named as LoanManagement with following variables and methods :-
//customerName, LoanAmount, interestRate, Loantenure - in years
//
//Methods :-
//calculateInterest():-
//Accept loanAmount and interestRate as arguments.
//Calculate and return the simple interest.
//
//calculateTotalAmount ()
//Accept the calculated
//interest as an argument.
//Return the total amount payable.
//
//calculateMonthlyEMI():-
//Accept the total payable amount and loan tenure as arguments.
//Return the monthly EMI.
//
//displayLoanSummary():-
//Accept the interest,
//total amount, and EMI as arguments.

package com.methods;

public class Loan_managment {
	String Cuctomer_name;
	int loan_temure;
	double total_Amount_pay;
	double Intrest;
	int amount;

	double calculate_Intrest(double amount, double intrest) {
		double calculate = (amount * intrest * loan_temure) / 100;
		return calculate;
	}

	double calculate_TotalAmount(double calculate) {
		total_Amount_pay = calculate + amount;
		return total_Amount_pay;
	}

	double calculate_MonthlyEMI() {
		double EMI = total_Amount_pay / (loan_temure * 12);
		return EMI;
	}

	void display() {
		System.out.println("Customer Name :" + Cuctomer_name);
		System.out.println("loan   temure :" + loan_temure);
		System.out.println("loan amount:" + amount);

	}

	public static void main(String[] args) {
		Loan_managment l = new Loan_managment();
		l.Cuctomer_name = "sai";
		l.loan_temure = 10;
		l.Intrest = 5;
		l.amount = 10000;
		l.display();
		double interest=l.calculate_Intrest(l.amount, l.Intrest);
		System.out.println("calculate  Intrest    :" + l.calculate_Intrest(l.amount, l.Intrest));
		System.out.println("calculate TotalAmount :" + l.calculate_TotalAmount(interest));
		System.out.println("calculate_MonthlyEMI  :" + l.calculate_MonthlyEMI());

	}

}
