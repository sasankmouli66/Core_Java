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
	
	int getCibilEligiblity(int cibil) {
	    int roi = 14;

	    if (cibil > 750 && cibil <= 900) {
	        System.out.println("Excellent: Best interest rates.");
	        roi -= 3;
	    } else if (cibil >= 700 && cibil <= 750) {
	        System.out.println("Good: Good chance of approval.");
	        roi -= 1;
	    } else if (cibil >= 650 && cibil < 700) {
	        System.out.println("Average: Higher interest rates may apply.");
	        roi += 2;
	    } else {
	        System.out.println("Low: High chance of rejection.");
	        roi += 6;
	    }

	    return roi;
	}

	public static void main(String[] args) {
		
		Bank_loan b1 = new Bank_loan();
		double salary = b1.getEmpSalary();
		int cibilScore = b1.getCibilscore();
		if(salary >= 1000000.0 && (cibilScore > 300 && cibilScore <= 900)) {
			System.out.println("Congralation check more details..");
			if(b1.getArdhar() && b1.getPan() && b1.getPhone()) {
				System.out.println("Details are Valid..");
				int checkEligibility = b1.getCibilEligiblity(cibilScore);
				System.out.println("Rate of Interest: " + checkEligibility + "%");
			}
			else {
				System.out.println("details are not valid..");
				System.out.println("Loan will be rejected");
			}
			
		}
		else {
			System.out.println("Your are not Eliglible for loan");
		}	
	}
	
}
