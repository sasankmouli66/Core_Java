package com.oops.inheritance.abstsrction;

public interface Animal {

	public static int a = 10;
	public static final String Name = "sri sai";
	
	public void sound();

	public void walk();

	public void eat();
	
	public default void sleep() {
		System.out.println("Animals Can Sleep");
		hello();
	}
	
	private void hello() {
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
	}

}
