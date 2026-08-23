//.Write a Java Program to take 2 instance and 2 static methods with 
//arguments and return type call these methods each one in another 
//one call the any one of the method in main but all the methods 
//data should be displayed 
//Note Display one object in over all program 

package com.methods;

public class Main {
	int add(int a, int b) {
		int result = a + b;
		System.out.println("subtration  :" + sub(10, 20));
		return result;
	}

	int sub(int a, int b) {
		int sub = a - b;
		System.out.println("Multiplytion :" + multiply(20, 6));
		return sub;
	}

	static int multiply(int a, int b) {
		int multiply = a * b;
		System.out.println("division :" + div(5, 6));
		return multiply;
	}

	static int div(int a, int b) {
		int div = a / b;
		return div;
	}
	public static void main(String[] args) {
		Main t = new Main();

		System.out.println("Addition :"+t.add(2,9));
	}

}
