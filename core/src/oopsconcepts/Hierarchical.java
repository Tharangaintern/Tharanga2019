package oopsconcepts;

class AA{
	void display()
	{
		System.out.println("AA");
	}
}
class BB extends AA{
	void show()
	{
		System.out.println("BB");
	}
}

class CC extends BB{
	void dis()
	{
		System.out.println("CC");
	}
}


public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CC obj1=new CC();
 obj1.dis();
 obj1.display();
 
 BB obj2 =new BB();
 obj2.show();
 obj2.display();
 


	}

}
