package com.loop;
import java.util.Scanner;
public class Multiply {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a n1 number");
	int n1 = sc.nextInt();
	System.out.println("Enter a n2 number");
	int n2 = sc.nextInt();
	multiply(n1,n2 );
	}
	static void multiply(int n1,int n2 )
	{
		for(int i = 1;i<=10;i++)
		{
			int n3 = n1 * i;
			System.out.println(n1 +" * "+ i +" = "+n3);
		}
	}

}
