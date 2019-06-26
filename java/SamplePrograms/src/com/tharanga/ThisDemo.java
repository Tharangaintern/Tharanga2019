package com.tharanga;

public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C obj= new C(6);
obj.show();

	}

}
class C
{
	private int x;
	public C(int x)
	{
		this.x=x;
	}
	public void show()
	{
		System.out.println("x is " +x);
	}
}