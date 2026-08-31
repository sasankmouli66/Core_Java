package com.operatiors;
import java.util.Scanner;
public class Teranary_operator {

	public static void main(String[] args) {
//		int a = 75;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 80;
		int d = 67;
		String  c = (a >= 750) ? "A" :(a >= 650) ? "B" :(a >= 550) ? "C":"D";
		System.out.println(c);

	}

}
