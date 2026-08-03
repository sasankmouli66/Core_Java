package com.javaintro;



public class Demo {
	
	static void add(){
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		Demo.sub();
	}
	static void sub()
	{
		int c = 5;
		int d = 6;
		System.out.println(c-d);
		Demo t4 = new Demo();
		t4.multiply();
	}
	 
	void multiply()
	{
		int e = 7;
		int f = 2;
		System.out.println(e*f);
		Demo t5 = new Demo();
		t5.div();
	}
	
	void div()
	{
		int g = 7;
		int h = 2;
		System.out.println(g/h);
	}
	
	
	public static void main(String[] args) {
		
	 Demo.add();
	}

}
