package com.logical;
import java.util.Scanner;
public class positive_switch {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a value  :");
	int num = sc.nextInt();
	switch(Integer.compare(num, 0)) {
	case 1:
		System.out.println("Positive");
		break;
	case -1:
		System.out.println("negative");
		break;
	default :
		System.out.println("--------------");
	}
	

	}

}
