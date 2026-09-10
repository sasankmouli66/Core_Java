package com.loop;

public class Class1 {

	public static void main(String[] args) {
		int rev = 5214;
		System.out.println("BBB");
		int num = 0;
		while (rev > 0) {
				int i = rev % 10;
				num = (num * 10) + i;
				rev = rev / 10;		
		}
		System.out.println(num);

	}

}



