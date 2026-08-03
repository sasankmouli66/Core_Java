package com.dsa;
import java.util.Scanner;

public class PrimeNunmbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		
		int count = 0;
		//System.out.println("Enter a Number");
		
		for(int i = 1;i<= num;i++)
		{
			if(num % i ==0)
			{
				count++;
			}
		}
		if(count == 4)
		{
			System.out.println("Prime");
		}
		else 
		
		{
			System.out.println("Not Prime");
		}

	}

}
