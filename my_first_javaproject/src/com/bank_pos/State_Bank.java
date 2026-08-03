package com.bank_pos;

import java.util.Scanner;

public class State_Bank {

	static Scanner sc = new Scanner(System.in);

	String getCustomerName() {
		System.out.print("Enter CustomerName :");
		String name = sc.nextLine();
		return name;
	}

	int getage() {

		System.out.print("Enter Your Age :");
		int age = sc.nextInt();
		//System.out.println("Enter Your Age :" + age );
		return age;
	}

	double getsal() {
		System.out.print("Enter Annual Salary :");
		double sal = sc.nextDouble();
		return sal;
	}
	int cibilInfo() {
		System.out.print("Enter CIBIL Score : ");
		int cibil = sc.nextInt();
		return cibil;
	}

	double getROI() {
		int cibil = cibilInfo();
		double roi = 15.0;
		if (cibil >= 300 && cibil < 550) {
			System.out.println("Your Cibil score is Poor");
			System.out.println("Poor high risk for Lenders");
			roi += 2.0;
			return roi;
		} else if (cibil >= 550 && cibil < 650) {
			System.out.println("Average - Credit may be approved with Difficult ");
			return roi;
		} else if (cibil >= 650 && cibil < 750) {
			System.out.println("Good - Accept to many Lenders");
			roi -= 2.0;
			return roi;
		} else if (cibil >= 750 && cibil < 900) {
			System.out.println("Excellent - High approal");
			roi -= 4.0;
			return roi;
		} else {
			System.out.println("Invalid Cibil Score");
			return roi;
		}

	}

	boolean isValidphone() {
		System.out.print("Enter Phone Number :");
		String phone = sc.next();
		boolean isValid = phone.matches("^[6-9]{5}[0-5]{5}");
		System.out.println("Phone Number : " + isValid);
		return isValid;
	}

	boolean isPanValid() {
		System.out.print("Enter Pan Number : ");
		String pan = sc.next();
		boolean isPan = pan.matches("^[A-Z]{4}[0-9]{4}[A-Z]{1}");
		System.out.println("Pan Details : " + isPan);
		return isPan;
	}

	boolean isArdharValid() {
		System.out.print("Enter Ardhar Number : ");
		String ardhar = sc.next();
		boolean isArdhar = ardhar.matches("^[0-9]{4}[0-9]{4}[0-9]{4}$");
		System.out.println("Enter Ardhar Details :" + isArdhar);
		return isArdhar;
	}


}
