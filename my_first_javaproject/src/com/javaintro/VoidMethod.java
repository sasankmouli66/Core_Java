package com.javaintro;

public class VoidMethod {
	//////////STSASTIC METHOD/////////////
	static VoidMethod v = new VoidMethod();

	static void method() {
		System.out.println("method 1 called");
		method2(); /////////METHOD CALLING ////////
		
	}

	static void method2() {
		System.out.println("method 2 called");
		v.method3();
	}

		//////////INSTANCE METHOD //////////
	void method3() {
		System.out.println("method 3 called");
		v.method4();
	}
	
	void method4()
	{
		System.out.println("method 4 called");
	}

	public static void main(String[] args) {
		System.out.println("Main method Strated!");
		method();	////METHOD CALLING STEP BY STEP ////////.,MNB VCXZ
		
	}
}
