package oopsconcepts;

import oopsconcepts.A;
import oopsconcepts.B;
import oopsconcepts.C;

abstract class A {

	abstract void display();
}

abstract class B extends A {
	void display() {
		System.out.println("hello");
	}

}

class C extends B {
	void show() {
		System.out.println("hi");
	}


}

public class Abstract {
	public static void main(String args[]) {
		C obj = new C();
		obj.display();
		obj.show();
	}
}
