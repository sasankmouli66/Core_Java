package com.logical;
import java.util.Scanner;
public class Words_switch {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a word");
	int c = sc.nextInt();
	
	switch(c) {
	case 1->{
		System.out.println("One");
	}
	case 2->{
		System.out.println("Two");
	}
	case 3->{
		System.out.println("Three");
	}
	default ->{
		System.out.println("Invalid letters");
	}
	}
	sc.close();		

	}

}
