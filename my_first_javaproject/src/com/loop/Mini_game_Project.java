//1. Mini-Game Project :-
//create a java class that complete below requirements ,
//>  using Random class from java.util Generate a Random number between range 1 to 10
//› user able to give the input from console for atleast three times and campare the generated number with user input
//› if both are equal in first chance display the message "YOU WON!"
//› if not continue the process upto three times, if user not able to guess the number in 3rd time display the message "BETTER LCK NEXT TIME" 

package com.loop;

import java.util.Random;
import java.util.Scanner;

public class Mini_game_Project {

	public static void main(String[] args) {
		Random r = new Random();
		int x = r.nextInt(1,11);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			if (n == x) {
				System.out.println("yon Wom");
				break;
			}
			else {
				System.out.println("better luct next 2 Times");
				break;
			}
		}

	}

}
