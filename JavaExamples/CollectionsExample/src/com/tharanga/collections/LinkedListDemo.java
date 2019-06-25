package com.tharanga.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LinkedListDemo
{
	public static void main(String[] args) 
	{
		List<Integer> values = new ArrayList<Integer>();
		values.add(305);
		values.add(998);
		values.add(774);
		values.add(230);
		values.add(881);
		Collections.sort(values,(o1,o2)->
		{
			return o1%10 > o2%10 ?1 :-1;
		});
		for(int i : values)
		{
			System.out.println(i);
		}
	}
}
