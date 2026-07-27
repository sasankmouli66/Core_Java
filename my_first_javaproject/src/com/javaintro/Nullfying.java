package com.javaintro;

public class Nullfying {
	static void G1() {
		 Nullfying g = new Nullfying();
	}
	public static void main(String[] args) {

		Nullfying t1 = new Nullfying();
		Nullfying t2 = new Nullfying();
		Nullfying t3 = new Nullfying();
        G1();
		t1 = null;
		t2 = null;
		t3 = t2;

		System.gc();

	}

	public void finalize() throws Throwable {
		System.out.println("finalize called");
	}

}
