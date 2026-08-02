package com.dsa;

import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("enter a number");
	int fact = 1;
	int n = in.nextInt();
	int i = 1;
	do 
	{
		fact = fact * i;
		i++;
	}
	while(i <= n);
		
//	for(int i = 1;i<=n;i++)
//	{
//	    fact = fact * i;
//	}
	System.out.println(fact);
	}
}
