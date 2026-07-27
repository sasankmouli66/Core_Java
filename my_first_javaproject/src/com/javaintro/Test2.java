package com.javaintro;

public class Test2 
{
    /////Instances Method
	void hello() {
		System.out.println("sasank");
	}
	////Ststic Method 
	static void mouli() {

		System.out.println("Mouli");
	}

	public static void main(String[] args) {
		System.out.println("man walk in Road");
		///Instance method can not directly access
		/// we can acess to create object in instance method
		Test2 obj = new Test2();
		obj.hello();
        ///static directly call the method in class name
		System.out.println("Hitech City");
		Test2.mouli();

	}

	
}
