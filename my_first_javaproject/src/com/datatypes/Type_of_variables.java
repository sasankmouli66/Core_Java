package com.datatypes;

public class Type_of_variables
{
	static String A = "Marcos";
	int age = 45;

	public static void main(String[] args) {
		Type_of_variables s  = new Type_of_variables();
        System.out.println(s.age);
        System.out.println(A);/// directly Accessed
        System.out.println(Type_of_variables.A);// class Name Acess
	}
}
