package oopsconcepts;
class D{
	void display()
	{
		System.out.println("d");
	}
}
class E extends D{
	void show()
	{
		System.out.println("e");
	}
}
class F extends E{
	void dis()
	{
		System.out.println("f");
	}
}


public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      F obj= new F();
      obj.display();
      obj.show();
      ((F)obj).dis();
	}
}

