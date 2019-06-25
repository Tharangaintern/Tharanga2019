package com.tharanga.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo
{
	public static void main(String[] args) 
	{
		Collection<Integer> values = new ArrayList<Integer>();
		values.add(3);
	//	values.add("Lavanya");
		values.add(5);
		values.add(115);
		values.remove(3);
		
//		Iterator i = values.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		
		for(int i : values)
		{
			System.out.println(i);
		}
	}
}
