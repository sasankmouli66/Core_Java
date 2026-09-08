//1. Write a Java Program to complete below requirements 
// 
// > Create a Class with name        Online voting system 
// Program should ask user age , gender, voterIdNo 
//
//Conditions :- 
// > if age is less than 18 display “not eligible “ message 
// 
// > If eligible then only ask about gender 
// 
// > If gender is not M or F display not eligible , if eligible then 
//Ask next one as Enter VoterId No 
//
// > if user enters VoterId Display 4 candidate options 
//And ask user to press any one options below message if user chooses 
//any option display with proper message as  ex :-“ Vote is Captured for 
//Mark Antony ” use candidate name in the message 
//
// > If user Chooses different option rather than above mentioned ,
//Display message as Thanks for Voting To NOTA

package com.logical;
import java.util.Scanner;
public class votting {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a age ");
		int age = sc.nextInt();
		if(age >= 18) {
			
			System.out.println("Eligeble for vote");
			System.out.println("Enter a gender ");
			String gender = sc.next();
			
			if (gender.equals("M") || gender.equals("F"))
			{
				System.out.println("Eligeble for Gender");
				System.out.println("Enter voter Id");
				int voterId = sc.nextInt();
				
				System.out.println("Enter a vote");
				int vote = sc.nextInt();
				
				System.out.println("----- User Details -----");
                System.out.println("Age      : " + age);
                System.out.println("Gender   : " + gender);
                System.out.println("VoterId  : " + voterId);
               
				
				switch(vote) {
				case 1 :
					System.out.println("Vote for Nota");
					System.out.println("thanks for voting");
					 System.out.println("------------------------");
					break;
				case 2 :
					System.out.println("Vote for KCR");
					System.out.println("thanks for voting");
					 System.out.println("------------------------");
					break;
				case 3 :
					System.out.println("Vote for YSR");
					System.out.println("thanks for voting");
					 System.out.println("------------------------");
					break;
				case 4 :
					System.out.println("Vote for TDP");
					System.out.println("thanks for voting");
					 System.out.println("------------------------");
					break;
				default :
					System.out.println("invalid detils");
				}
				
			}
			else {
				System.out.println("Not Eleglible for gender");
			}
		}
		else {
			System.out.println("not Eliglibe for vote");
		}
	

	}

}
