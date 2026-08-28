//static block
//instance block
//no-argument constructor
//parameterized constructor
//static method
//instance method
//main()

package com.constructors;

public class Insatnce {
	String name;
	int n;
	static 
	{
		System.out.println("static void method.....");
	}
	 
	{
		System.out.println("instance block method...");
	}
	Insatnce()
	{
		name = "Michele";
	}
	Insatnce(String name,int n)
	{
		this.name = name;
		this.n = n;
	}
	
	public static void main(String[] args) {
		
		Insatnce s = new Insatnce();
		s.show();
		
		Insatnce s1 = new Insatnce("sai",6);
		s1.show();
	}
	void show()
	{
		System.out.println(name);
		System.out.println(n);
	}
}
