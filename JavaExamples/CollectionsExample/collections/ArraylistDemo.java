package com.tharanga.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArraylistDemo
{
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Lavanya");
		names.add("Jithu");
		names.add("Rahul");
		names.add("Lavanya");
		Set<String> s = new HashSet<>();
		for(String name : names)
		{
			if(s.add(name) == false)
				System.out.println(name);
		}
	}
}
