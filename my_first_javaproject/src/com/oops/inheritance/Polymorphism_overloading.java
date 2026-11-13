package com.oops.inheritance;

public class Polymorphism_overloading {

	public static void main(String[] args) {
		System.out.println("Main method");
		Polymorphism_overloading p = new Polymorphism_overloading();
		p.sub(10,20);

	}
	
	void sub(int i,float j) {
		System.out.println("int argments in overloading");
	}
	
	void sub(int i,int j) {
		System.out.println("float int argments in overloading");
	}
	
	void sub(double  i,int j) {
		System.out.println("double int argments in overloading");
	}

}
