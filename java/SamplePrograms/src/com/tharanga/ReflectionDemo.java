package com.tharanga;

import java.lang.reflect.Method;

import com.kavya.Test;

public class ReflectionDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class c = Class.forName("com.kavya.Test");
		Test t = (Test)c.newInstance();
		
		Method m = c.getDeclaredMethod("show",null);
		m.setAccessible(true);
		m.invoke(t, null);

	}

}
