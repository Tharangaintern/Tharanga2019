package com.taranga.dependentObject;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QuestionMap {
	private int id;
	private String name;
	private Map<AnswerMap,UserMap>answers;
	 
	public QuestionMap(int id, String name, Map<AnswerMap, UserMap> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	
	public void displayInfo() {
		System.out.println("Questions id:" + id);
		System.out.println("Question name:" + name);
		System.out.println("Answers......");
		Set<Entry<AnswerMap,UserMap>>set=answers.entrySet();
		Iterator<Entry<AnswerMap,UserMap>> itr=set.iterator();
		
		while(itr.hasNext()) {
			Entry<AnswerMap,UserMap> entry=itr.next();
			AnswerMap ans=entry.getKey();
			UserMap user=entry.getValue();
			System.out.println("Answer info:-\n"+ans);
			System.out.println("Posted by:-"+user);
			
		}
	}
	

}
