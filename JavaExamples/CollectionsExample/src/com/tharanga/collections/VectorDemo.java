package com.tharanga.collections;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo
{
	public static void main(String[] args) 
	{
		Vector<Integer> v = new Vector<Integer>();
		v.add(4);
		v.add(5);
		v.add(9);
		v.add(41);
		v.add(55);
		v.add(98);
		v.add(49);
		v.add(52);
		v.add(91);
		v.add(47);
		v.add(59);
		v.add(93);
		v.remove(4);
		System.out.println(v.capacity());
//		ArrayList<Integer> v = new ArrayList<>();
//		System.out.println(v);
		for(int i : v)
		{
			System.out.println(i);
		}
	}
	
}
