package com.tharanga;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=27;
boolean b = isPerfect(n);
if (b)
System.out.println("Its a perfect number");
else
	System.out.println("Its not");
	}
public static boolean isPerfect(int n)
{
	int sum=0;
	for(int i=1;i<=n/2;i++)
	{
	if(n % i ==0)
	sum+=i;
}

if(n==sum)
	return true;
return false;
}
}
