package com.javaintro;

public class Gc {
	static int count = 0;

	{
		count++;
	}

	public static void main(String[] args) {

		 Gc s1 = new Gc();
		 Gc s2 = new Gc();
		 Gc s3 = new Gc();
		 
		 
		 System.out.println(count);
		 
		 
	}

}
