package com.oops.inheritance.abstsrction;

import java.sql.SQLException;

public class Animal1 {

	public static void main(String[] args)throws SQLException {
		System.out.println("Welcome "+ Animal.Name +"Animal Park");
		Animal c = new Cat();
		c.eat();
		c.walk();
		c.sound();
		c.sleep();

		System.out.println("=========================");
		Animal d = new Dog();
		d.eat();
		d.walk();
		d.sound();
		
	}

}
