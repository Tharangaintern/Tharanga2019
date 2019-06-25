package com.tharanga.collections;

import java.util.Comparator;

public class ComparatorImplement implements Comparator<Integer>
{
	public int compare(Integer o1,Integer o2)
	{
		if(o1 > o2)
			return 1;
		return -1;
	}
}
