package com.taranga.dependentObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.taranga.dependentObject.QuestionMap;

public class TestMaP {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("CIUsingNonStringMap.xml");
		QuestionMap ques=(QuestionMap) ac.getBean("q");
		ques.displayInfo();
	}

}
