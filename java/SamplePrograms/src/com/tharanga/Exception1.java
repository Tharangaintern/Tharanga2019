package com.tharanga;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j=1,k=0;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
i=8;

try
{
	System.out.println("Enter a number");
j=Integer.parseInt(br.readLine());

k=i/j;
System.out.println("output is:" + k);
System.out.println("BYE");
}
catch (IOException e)
{
	System.out.println("some IO Error");
}
catch (ArithmeticException e)
{
	System.out.println("Cannot Divide by zero"+e);
}

	}

}
