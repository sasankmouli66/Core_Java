package com.loop;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int temp= 0;
		while (n > 0) {
			temp = n % 10;
			if (temp % 2 == 0) {
				System.out.print(temp + " ");
				count ++;
			}
			n = n / 10;
		}

		System.out.println(count+" ");
	}

}
