package com.dsa;

import java.util.Scanner;

public class LeapYear {
	
	static void Year(int year) {
		if ((year % 4 == 0) || (year % 400 == 0 && year % 100 != 0))
		{
		System.out.println("Leap Year");
	}
		else {
			System.out.println("Not Leap Year");
		}
	}
	
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Year:");
		int year = in.nextInt();
		//int year1 = in.nextInt();
		
		Year(year);

//		if (year % 4 == 0) {
//			if (year % 100 == 0) {
//				if (year % 400 == 0) {
//					System.out.println("Leap Year");
//				}
//				else {
//					System.out.println("Not Leap Year");
//				}
//				
//			}
//			else {
//				System.out.println("Leap Year");
//			}
//		}
//		else {
//			System.out.println("Not Leap year");
//		}
					
	}
	}
