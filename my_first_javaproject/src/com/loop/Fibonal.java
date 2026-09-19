package com.loop;
import java.util.Scanner;
public class Fibonal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n  = sc.nextInt();
	int n1 = 0;
	int n2 = 1;
	int n3 = 0;
	int count=0;
	for(int i = 0; i < n-2;i++) {
		n3 = n1 + n2;
		count++;
		n1 = n2;
		n2 = n3;
	
	}
	System.out.println("Fibonicial :"+n3);
	}
	
	

}
