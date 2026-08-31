package com.operatiors;
//   &&  and
//  ||  xnor
//  !    not
public class Logical_operator {

	public static void main(String[] args) {
//		************AND*******************
		System.out.println(true && true );
		System.out.println(false && true);
		System.out.println(true && false);
		System.out.println(false && false);
		System.out.println("_________________");
//		*************XOR******************
		System.out.println(true || true );
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(false || false);

//		************NOT*************
		System.out.println("_________________");
		System.out.println(! true );
		System.out.println(! false);
		

	}

}
