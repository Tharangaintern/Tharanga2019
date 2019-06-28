package com.tharanga.collectionUsingSetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("collectionUsingSetter.xml");
		
		Test t=(Test) ac.getBean("c");
		t.printData();
	}

}
