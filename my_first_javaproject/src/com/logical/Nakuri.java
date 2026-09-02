package com.logical;

import java.util.Scanner;

public class Nakuri {

	public static void main(String[] args) {
		String n1 = "Java";
		String n2 = "Python";
		String n3 = "C++";
		Scanner sc = new Scanner(System.in);
		System.out.println("So, tell me...");
		String name = sc.nextLine();
		System.out.println("hello Sir, My name is " + name);
		System.out.println("Let's Continue " + name);
		System.out.println("Tell Me Education Percentage");

		System.out.println("My B.Tech Percentage");
		double beachlorOftechnology = sc.nextDouble();

		System.out.println("My Diploma Percentage");
		double diploma = sc.nextDouble();
		if (beachlorOftechnology >= 60 && diploma >= 60) {
			System.out.println("Education Percentage My expectations Match");

			System.out.println("You Have Any technical Skills");
			String skill_1 = sc.nextLine();
			String skill_2 = sc.nextLine();
			sc.nextLine();
			String skill_3 = sc.nextLine();
			if (skill_1.equals(n1) && skill_2.equals(n2) && skill_3.equals(n3)) {
				System.out.println("Your Skill also Matched");

				System.out.println("How Much CTC will Except");
				double ctc = sc.nextDouble();
				if (ctc >= 300000 && ctc <= 600000) {
					System.out.println("Congracts Your Slected");

				} else {
					System.out.println("Sorry Better Luck Next Time...");
				}

			} else {
				System.out.println("Sills Not Matches....");
			}
		} else {
			System.out.println("Sorry Not Match Education");
		}
	}

}
