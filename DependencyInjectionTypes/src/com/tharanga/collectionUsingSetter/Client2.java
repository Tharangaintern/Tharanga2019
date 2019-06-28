package com.tharanga.collectionUsingSetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client2 {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("collectionUsingSetter2.xml");
		
		Test2 t=(Test2) ac.getBean("c");
		t.printData();
	}

}
