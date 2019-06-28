package com.tharanga.collectionUsingSetter;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	private List fruits;
	private Set criketers;
	private Map cc;
	
		
	
	public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	
	public void setCriketers(Set criketers) {
		this.criketers = criketers;
	}
	public void setCc(Map cc) {
		this.cc = cc;
	}
	
	public void printData() {
		System.out.println("Fruits......");
		for(Object fruit:fruits)
		{
			System.out.println(fruit);
		}
		
		System.out.println("Criketers......");
		for(Object criketer:criketers)
		{
			System.out.println(criketer);
		}

		System.out.println("Country and Capital......");
		Set keys=cc.keySet();
		for(Object key:keys)
		{
			System.out.println("Country="+key+" "+"Capital="+cc.get(key));
		}
	
	}
	
	
}
