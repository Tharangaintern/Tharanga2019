package com.tharanga;

public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B obj = new B();
obj.abc();
	}

}
class A{
	public void abc()
	{
		System.out.println("A abc");
	}
	
}
class B extends A{
	int i=4;
	public void abc()
	{
		super.abc();
		System.out.println("B abc");
	}
}