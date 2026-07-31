package com.javaintro;

public class Instance {
	static {
		System.out.println("Main Method Started !");
		Instance E = new Instance();
		E.A();
		System.out.println(E);
	}
	
	void A() {
		System.out.println("welcome Java World");
		B();
	}
	
	void B() {
		System.out.println("Java is Semple");
		C();
	}
	
	void C() {
		System.out.println("It is Object Oriented Programming");
		D();
	}
	
	void D() {
		System.out.println("teach Srikanta Sir");
	}

	public static void main(String[] args) {
		
      
//		Instance E = new Instance();
//		E.A();
//		
	}

}
