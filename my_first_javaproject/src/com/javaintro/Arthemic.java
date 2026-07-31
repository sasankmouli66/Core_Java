package com.javaintro;

public class Arthemic {
	static Arthemic Arm = new Arthemic();
	static int a = 26;
	static int b = 9;
	
	static void add() {
		System.out.println("Addition = "+ (a+b));
		Arm.sub();
	}
	void sub() {
		System.out.println("Subtrarion = "+ (a-b));
		Arm.div();
	}
	void div() {
		System.out.println("Division = "+ (a/b));
		Arm.multiply();
	}
	void multiply() {
		System.out.println("Addition = "+ (a*b));
		
	}

	public static void main(String[] args) {
		System.out.println("Enter the Arthemic Operations");
	
     Arm.add();
	}
}
