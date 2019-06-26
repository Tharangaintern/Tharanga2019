package com.tharanga;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=5;
try
{
	if(i<10)
	{
		throw new Exception("Errrrorrr");
	}
}
	catch(Exception e)
	{
	System.out.println(e);
}

	}

}
class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg);
	}
}