package com.oops.inheritance;

public class Hemo_loan extends Bank_loan {

	public static void main(String[] args) {

		System.out.println("Welcome to Hemo Loans....");
		Hemo_loan h1 = new Hemo_loan();
		double salary = h1.getEmpSalary();
		int cibilScore = h1.getCibilscore();
		if (salary > 1000000.0 && (cibilScore > 300 && cibilScore <= 900)) {
			System.out.println("Congralation check more details..");
			if (h1.getArdhar() && h1.getPan() && h1.getPhone()) {
				System.out.println("Details are Valid..");
			} else {
				System.out.println("details are not valid..");
			}

		} else {
			System.out.println("Your are not Eliglible for loan");
		}
		int checkEligibility = h1.getCibilEligiblity();

	}

}
