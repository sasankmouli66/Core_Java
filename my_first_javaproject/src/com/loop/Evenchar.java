package com.loop;
import java.util.Scanner;
public class Evenchar {
	int i = 1;
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Char:");
	char a = sc.next().charAt(0);
	
	for(int i = 1;i<=26;i++)
	{
		if(i%2==0)
		{
			System.out.println(i+" ->"+a);
		}
		a++;
	}
	
	}

}
