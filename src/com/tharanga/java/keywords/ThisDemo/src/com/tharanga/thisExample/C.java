package com.tharanga.thisExample;

public class C {                         // to pass as an argument in method

	public void m(C obj) {
		System.out.println("method invoked");
	}

	public void n() {
		m(this);

	}

	public static void main(String[] args) {
		C c = new C();
		c.n();

	}

}
