package com.datatypes;
public class DataTypes {
	int i = 20;  //Integer is a Numeric Values
	byte b = (byte)128; //Eclipt Type casting is int to bye casting
	short s = b; //Implict Type Casting : it converts to byte to short
	long l = 568942169l; // 
	float f = 60f;
	double d = 26d;
	char c = 'l';
	boolean B = true;
	public static void main(String[] args) {
		DataTypes t1 = new DataTypes();
		System.out.println("Integer : "+ t1.i);
		System.out.println("Short : "+ t1.s);
		System.out.println("Byte : "+ t1.b);
		System.out.println("Short : "+ t1.s);
		System.out.println("Long : "+ t1.l);
		System.out.println("Float : "+ t1.f);
		System.out.println("Double : "+ t1.d);
		System.out.println("Char : " + t1.c);
		System.out.println("Boolean : "+ t1.B);
	}

}
