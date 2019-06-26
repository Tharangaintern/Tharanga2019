package com.tharanga.thisExample;

//to pass this as argument in constructor call
class A2 {
	D obj;

	A2(D obj) {
		this.obj = obj;
	}

	void display() {
		System.out.println(obj.data);
	}

}

public class D {

	int data = 10;

	D() {
		A2 a = new A2(this);
		a.display();
	}

	public static void main(String args[]) {
		D a = new D();
	}
}