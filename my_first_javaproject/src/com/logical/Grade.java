//Create a Java program to Assign the Grade Based on the Student marks as
//Mentioned below
//100 to 91 -> S Grade
//90 to 81 -> A Grade
//80 to 71 -> B Grade 
//51 to 70 -> C Grade
//41 to 50 -> D Grade
//35 to 40 -> E Grade
//0 to 34 -> Failed
//
//Less than 0 or Greater Than 100 -> Invalid Marks
//Using Ternary Operator
//
//1. Write a Java Program that takes a Integer as input
//→› if the Integer is only Divisible By 3 Print "Fizz"
//-› if the Integer is only Divisible By 5 Print "Buzz"
//- is the Integer is Divisible by Both 3, 5 then print "Fizz Buzz" 
//using conditional statements ex: - input : - 15
//output :- Fizz Buzz

package com.logical;
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Marks");
	int marks = sc.nextInt();
	
	String result = (marks >= 91) ? "S":(marks >= 81) ? "A":
					(marks >= 71) ? "B":(marks >= 70) ? "C":
					(marks >= 50) ? "D":(marks >= 40) ? "E":"F";
	System.out.println("Grade :"+result);

}
}
