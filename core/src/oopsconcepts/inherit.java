package oopsconcepts;

import oopsconcepts.child;
import oopsconcepts.parent;

class parent{
	int a=20;
	void display()
	{
		System.out.println("parent");
	}
}
class child extends parent{
	int b=10;
	void show()
	{
		System.out.println("child");
	}
}

public class inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
child c=new child();
System.out.println(c.b);
c.show();
System.out.println(c.a);
c.display();
	}

	}
