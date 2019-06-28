package com.taranga.dependentObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("dependentObject.xml");
		 
		 Employee emp=(Employee) ac.getBean("e");
		 emp.print();
	}

}
