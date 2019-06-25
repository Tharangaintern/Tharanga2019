package com.tharanga.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListInterface 
{
	public static void main(String[] args) 
	{
		List<Integer> values = new ArrayList<Integer>();
		values.add(3);
		values.add(99);
		values.add(5);
		values.add(77);
		values.add(14);
		Collections.sort(values);
		values.forEach(System.out::println);
	}
}
