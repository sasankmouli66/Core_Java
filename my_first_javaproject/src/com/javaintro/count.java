//write a Java program to Find the count of objects created in class 
//without using instance block

package com.javaintro;
public class count {
	static int i;
	count()
	{
		i++;
	}
	public static void main(String[] args) {
		count c = new count();
		count c1 = new count();	
		count c3 = new count();
		System.out.println(i);
	}

}
