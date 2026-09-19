package com.whileloop;
import java.util.Scanner;
public class Armstrong_number {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	boolean result = arm_Strong(n);
	
	if(result) {
		System.out.println("Aramstrong");
	}
	else {
		System.out.println("Not Armstrong");
	}

	}
	static boolean arm_Strong(int n) {
		boolean status = true;
		int temp = n;
		int count = 0;
		while(temp > 0) {
			temp = temp / 10;
			count++;
		}
		int r = 0;
		
		while(temp> 0) {
			r = n % 10;
			temp = temp / 10;
			int sum = (int)Math.pow(r, temp);
		}
		
		return status;	
	}
	

}
