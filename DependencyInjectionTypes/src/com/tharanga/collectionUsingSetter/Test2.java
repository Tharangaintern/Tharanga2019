package com.tharanga.collectionUsingSetter;

import java.util.Hashtable;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test2 {
	
	private Vector fruits;   //shows error with dtd,so use xsd/schema in xml file .
	private TreeSet criketers;
	private Hashtable cc;       
	
	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}
	public void setCriketers(TreeSet criketers) {
		this.criketers = criketers;
	}
	public void setCc(Hashtable cc) {
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
