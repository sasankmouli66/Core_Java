package com.arrays;
import java.util.Scanner;
public class Strings {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String :");
	String[] str = new String[10];
	str[0] = "sai";
	str[1] = "Prasd";
	str[2] = "lakshna";
	str[3] = "Rohit";
	str[4] = "sai";
	str[5] = "Prasd";
	str[6] = "lakshna";
	str[7] = "Rohit";
	str[8] = "sai";
	str[9] = "Prasd";
	
	
	for(int i = 0;i < str.length;i++) {
		if(str[i].startsWith("s")) {
			System.out.println(str[i].toUpperCase());
		}
	}

	}

}
