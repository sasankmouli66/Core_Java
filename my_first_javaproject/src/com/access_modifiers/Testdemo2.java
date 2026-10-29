package com.access_modifiers;

public class Testdemo2 {

	public static void main(String[] args) {
		Testdemo1 t = new Testdemo1();
		
		System.out.println("Main method Start...");
		System.out.println(t.Sid);
		System.out.println(t.Sname);	
		t.method();

	}

}
