package com.oops.inheritance;

import java.util.Scanner;

public class Bank_loan {
	
	static Scanner sc = new Scanner(System.in);
	
	double getEmpSalary() {
		System.out.println("Enter a salary:");
		double salary = sc.nextDouble();
		return salary;
	}
	
	int getCibilscore() {
		System.out.println("Enter a cibil Score:");
		int cibil = sc.nextInt();
		return cibil;
	}
	
	boolean getArdhar() {
		System.out.println("Enter Ardhar Number:");
		String ardhar = sc.next();
		boolean ardharStatus = ardhar.matches("[0-9]{12}");
		return ardharStatus;
	}
	
	boolean getPan() {
		System.out.println("Enter a Pan Number:");
		String pan = sc.next();
		boolean panStatus = pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		return panStatus;
	}
	
	boolean getPhone() {
		System.out.println("Enter a Phone number:");
		String phone = sc.next();
		boolean phoneStatus = phone.matches("[0-9]{10}");
		return phoneStatus;
	}
	
	int getCibilEligiblity() {
		int cibil = getCibilscore();
		int roi = 14;
		
		if(cibil > 750 && cibil <= 900) {
			System.out.println("Excellent: You qualify for the best interest rates and quickest approvals.");
			roi -= 3;
		}
		else if(cibil > 700 && cibil <= 749) {
			System.out.println("Good:  Good chance of approval, though terms depend on individual lender policy.");
			roi -= 7;
		}
		else if(cibil > 650 && cibil <= 699) {
			System.out.println("Average: Lenders may approve loans but might charge higher interest rates.");
			roi += 2;
		}
		else {
			System.out.println("Low: High chance of rejection due to risky repayment history");
			roi += 6;
			
		}
		return cibil;
	}

	public static void main(String[] args) {
		
		Bank_loan b1 = new Bank_loan();
		double salary = b1.getEmpSalary();
		int cibilScore = b1.getCibilscore();
		if(salary > 1000000.0 && (cibilScore > 300 && cibilScore <= 900)) {
			System.out.println("Congralation check more details..");
			if(b1.getArdhar() && b1.getPan() && b1.getPhone()) {
				System.out.println("Details are Valid..");
			}
			else {
				System.out.println("details are not valid..");
			}
			
		}
		else {
			System.out.println("Your are not Eliglible for loan");
		}	
		int checkEligibility = b1.getCibilEligiblity();
		sc.close();
	}
	
}
