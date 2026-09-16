package com.whileloop;
import java.util.Scanner;
class Magic_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n > 9) {
			int sum = 0;
			while(n > 0) {
				int digits = n % 10;
				sum = sum + digits;
				n = n / 10;
				
			}
			n = sum;
		}
		
		if(n == 1) {
			System.out.println("magic number");
		}
		else {
			System.out.println("Not a magic number");
		}

	}

}
