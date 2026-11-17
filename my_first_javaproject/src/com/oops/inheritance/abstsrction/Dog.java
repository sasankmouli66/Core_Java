package com.oops.inheritance.abstsrction;

public class Dog implements Animal{

	@Override
	public void sound() {
		System.out.println("Dog Can Sound Bow Bow ...");
		
	}

	@Override
	public void walk() {
		System.out.println("Dog Can Walk Normally");
	}

	@Override
	public void eat() {
		System.out.println("Dog Can Eat Veg and Non-Veg");
		
	}

}
