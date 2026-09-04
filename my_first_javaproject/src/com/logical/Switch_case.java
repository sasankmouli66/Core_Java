package com.logical;
import java.util.Scanner;
public class Switch_case {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a hostel No:");
	int hostel_No = sc.nextInt();
	
	switch(hostel_No)
	{
	case 1:
		System.out.println("Sri sai srinuvasa mens Pg");
		System.out.println("Goog");
		break;
	case 2:
		System.out.println("Sai Madhava hoatel");
		System.out.println("Better");
		break;
	case 3:
		System.out.println("Hrydhya hostel");
		System.out.println("bad");
		break;
	case 4:
		System.out.println("Sai Teja Luxurious hostel");
		System.out.println("Exclent");
		break;
	default:
		System.out.println("Invalid details");
	}
	sc.close();
	}

}
