package com.oops.inheritance.abstsrction;

public class Cat implements Animal{


	@Override
	public void sound() {
		System.out.println("Cat Sounds Memo memo...");
		
	}

	@Override
	public void walk() {
		System.out.println("Cat Walks Ramp Walk ...!");
		
	}

	@Override
	public void eat() {
		System.out.println("Cat eats Rat's");
		
	}
}
