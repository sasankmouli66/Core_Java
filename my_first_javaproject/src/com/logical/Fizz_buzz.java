//1. Write a Java Program that takes a Integer as input
//→› if the Integer is only Divisible By 3 Print "Fizz"
//-› if the Integer is only Divisible By 5 Print "Buzz"
//- is the Integer is Divisible by Both 3, 5 then print "Fizz Buzz" 
//using conditional statements ex: - input : - 15
//output :- Fizz Buzz

package com.logical;
import java.util.Scanner;
public class Fizz_buzz {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number :");
	int num = sc.nextInt();
	
	if(num % 3 ==0)
	{
		System.out.println("Fizz");
	}
	else if(num % 5 ==0)
	{
		System.out.println("Buzz");
	}
	else if(num % 3 == 0 && num % 5 == 0)
	{
		System.out.println("Fizz Buzz");
	}
	
	}
}
