package com.kavya;

interface A{
	
}
public class ReflectionDemo1 {

	public static void main(String[] args) throws Exception {
	
		// TODO Auto-generated method stub
Class C = Class.forName("com.kavya.A");
System.out.println(C.getSuperclass());
	}

}
