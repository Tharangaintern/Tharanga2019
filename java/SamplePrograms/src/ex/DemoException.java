package ex;

public class DemoException{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
int i,j,k=0;
int a[] = new int[4];
i=8;
j=2;
try
{
k=i/j;
for(int c=0;c<4;c++)

{
	a[c] = c+1;
}
for(int value:a)
{
	System.out.println(value);
}
}

catch (ArithmeticException e)
{
	System.out.println("cannot divide by zero");
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("maximum number of values is 4");
}
catch (Exception e)
{
	System.out.println("unknown exception");
}
System.out.println(k);
	}

}
