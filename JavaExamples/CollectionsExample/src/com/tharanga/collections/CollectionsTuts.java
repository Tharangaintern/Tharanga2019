package com.tharanga.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student1
{
	int rollno;
	int marks;
	
	public Student1(int rollno, int marks) 
	{
		this.rollno = rollno;
		this.marks = marks;
	}	
}

public class CollectionsTuts
{
	public static void main(String[] args)
	{
		List<Student1> studs = new ArrayList<>();
		studs.add(new Student1(1,55));
		studs.add(new Student1(2,75));
		studs.add(new Student1(3,85));
		studs.add(new Student1(4,48));
		studs.add(new Student1(5,89));
		Collections.sort(studs,(s1,s2)->{
			return s1.marks > s2.marks ?-1 : s1.marks < s2.marks ? 1 : 0;
		});
		for(Student1 s : studs)
		{
			System.out.println(s);
		}
	}
}
