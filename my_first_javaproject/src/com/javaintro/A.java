package com.javaintro;

public class A {
	
	static {
		System.out.println("main method 1");
		A B = new A();
		B.b();
	}
	void b(){
		System.out.println("main method 2");
	}

	public static void main(String[] args) {
		System.out.println("main method 3");

	}
	static {
		System.out.println("main method 4");
	}

}
