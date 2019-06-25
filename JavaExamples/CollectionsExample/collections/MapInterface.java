package com.tharanga.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface 
{
	public static void main(String[] args)
	{
		Map<String,String> map = new HashMap<>();
		map.put("MyName", "Lavanya");
		map.put("Actor", "Nithin");
		map.put("MyPhone", "Redmi");
		Set<String> keys = map.keySet();
		for(String key : keys)
		{
			System.out.println(key + " " + map.get(key));
		}
	}
}
