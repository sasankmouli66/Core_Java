package com.logical;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age <= 5)
		{
			System.out.println("Kid");
		}
		else if (age <= 12)
		{
			System.out.println("Child");
		}
		else if (age <= 19)
		{
			System.out.println("Teen ageer");
		}
		else if(age <= 29)
		{
			System.out.println("Yonger ager");
		}
		else if (age <= 40)
		{
			System.out.println("yonger man");
		}
		else if(age <= 60)
		{
			System.out.println("older age");
		}
		else
		{
			System.out.println("very old age");
		}
		sc.close();

	}

}
