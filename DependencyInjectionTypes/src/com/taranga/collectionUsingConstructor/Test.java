package com.taranga.collectionUsingConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("collectionUsingConstructor.xml");
		 
		 Question q=(Question) ac.getBean("e");
		 q.displayinfo();
	}

}
