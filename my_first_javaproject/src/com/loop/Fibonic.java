package com.loop;
import java.util.Scanner; 
public class Fibonic {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int a = sc.nextInt();
	int b = 0;
	int c = 1;
	int d = 0;
	for(int i =2;i<a;i++)
	{
		d = b + c;
		System.out.println(" "+d);
		b = c;
		c = d;	
	}

	}
	

}
