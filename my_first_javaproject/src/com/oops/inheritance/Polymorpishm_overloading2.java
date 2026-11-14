package com.oops.inheritance;

public class Polymorpishm_overloading2 {

	void main() {
	System.out.println("-----Areas Info------------");
	System.out.println("Area of square :"+add(10));
	System.out.println("Area of Rectangle :"+add(10.2,8.0));
	
	}
	
	int add(int side) {
		System.out.println("********Squqre Info ********");
		return side * side;
	}
	
	double add(double l,double b) {
		System.out.println("****Rectangle Info ********");
		return l * b;
	}

}
