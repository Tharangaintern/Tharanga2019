package com.tharanga.thisExample;

public class A {                    //to invoke current class method

	public void m() {
		System.out.println("inside m");
	}
	
	public void n() {
		System.out.println("inside n");
		m();    //same as this.m()
	}
	public static void main(String[] args) {
		A a=new A();
		a.n();

	}

}
