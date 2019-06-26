package com.tharanga.thisExample;

public class B {                       //to invoke the current class constructor

	B() {
		System.out.println("hello a");
	}

	B(int x) {
		this();
		System.out.println(x);
	}

	public static void main(String[] args) {
		B b = new B(10);

	}

}
