package com.oops;

public class Testdemo2 {

	public static void main(String[] args) {
		Testdemo1 t = new Testdemo1();
		t.setEid(20);
		t.setEname("Rahul");
		t.setSal(10000.00);
		System.out.println(t.eid);
		System.out.println(t.ename);
		System.out.println(t.sal);
		System.out.println("------------------------");
		Testdemo1 t1 = new Testdemo1();
		t1.setEid(20);
		t1.setEname("Rahul");
		t1.setSal(10000.00);
		System.out.println(t1.eid);
		System.out.println(t1.ename);
		System.out.println(t1.sal);
	}
}
