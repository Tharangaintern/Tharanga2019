package com.tharanga.thisExample;

class A1 {                       //to return this as a statement from method

	A1 getA1() {

		return this;
	}

	void display() {
		System.out.println("Hello java");
	}

}

public class E {

	public static void main(String[] args) {

		new A1().getA1().display();
	}
}