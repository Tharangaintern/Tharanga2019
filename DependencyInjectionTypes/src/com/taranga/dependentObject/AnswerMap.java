package com.taranga.dependentObject;

import java.util.Date;

public class AnswerMap {
	private int id;
	private String answer;
	private Date postedDate;
	
	public AnswerMap(int id, String answer, Date postedDate) {
		super();
		this.id = id;
		this.answer = answer;
		this.postedDate = postedDate;
	}

	@Override
	public String toString() {
		return " [id=" + id + ", answer=" + answer + ", postedDate=" + postedDate + "]";
	}
	
	

}
