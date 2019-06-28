package com.taranga.collectionUsingConstructor;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int id;
	private String ques;
	private List<Answer>ans;
	
	public Question(int id, String ques, List<Answer> ans) {
		super();
		this.id = id;
		this.ques = ques;
		this.ans = ans;
	}
	
	public void displayinfo() {
		
		System.out.println("Id="+id+" "+"question="+ques);
		System.out.println("Answers are...");
		Iterator<Answer> itr=ans.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		 
	}
	
	
	}
