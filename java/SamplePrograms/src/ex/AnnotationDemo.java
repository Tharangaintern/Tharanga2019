package ex;

class A
{
	
	public void showMyDataFromLastYearDatabase()
	{
		System.out.println("in A");
	}
	@Deprecated
	public void eat()
	{
}

class B1 extends A
{
	@Override
	
	public void showMyDataFromLastYearDatabase()
	{
		
		
		System.out.println("in B");
	}
}
public class AnnotationDemo {

	public void main(String[] args)
	{
		// TODO Auto-generated method stub
B1 obj = new B1();
obj.showMyDataFromLastYearDatabase();
	}
}
}