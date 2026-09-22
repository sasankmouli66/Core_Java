package com.arrays;
import java.util.Scanner;
public class Sum_avg {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number :");
	
	double[] arr = {52,65,89,12,36};
	
	double sum = 0;
	double avg = 0;
	
	for(int i = 0;i < arr.length;i++) {
		sum +=arr[i];
	}
	
	avg = sum / arr.length;
	
	System.out.println("Sum :"+sum);
	System.out.println("Avg :"+avg);
	}

}
