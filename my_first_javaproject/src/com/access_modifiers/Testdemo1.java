package com.access_modifiers;

interface test1{
	
}

public class Testdemo1 {
	
	int Sid =1;
	String Sname = "Sai";
	
	public void method() {
		System.out.println("Method end");
	}
	
	public static void main(String[] args) {
		Testdemo1 t = new Testdemo1();
		
		System.out.println("Main method Start...");
		System.out.println(t.Sid);
		System.out.println(t.Sname);	
		t.method();
	}
	
	private class A{
		
	}

}
