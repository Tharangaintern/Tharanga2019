package com.taranga.setterDI;

public class Test {
	private String gender;
	private String college;

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public void hello(String name) {
		System.out.println("hello..." + gender + " " + name);
		System.out.println("college=" + college);

	}

}
