package com.tharanga.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo
{
	public static void main(String[] args)
	{
		List<Student2> stud = new ArrayList<>();
		stud.add(new Student2(1,56));
		stud.add(new Student2(2,62));
		stud.add(new Student2(3,47));
		stud.add(new Student2(4,69));
		stud.add(new Student2(5,40));
		Collections.sort(stud);
		for(Student2 s : stud)
		{
			System.out.println(s);
		}
	}
}

class Student2 implements Comparable<Student2>
{
	int rollno;
	int marks;
	
	public Student2(int rollno, int marks) 
	{
		this.rollno = rollno;
		this.marks = marks;
	}
	
	public String toString()
	{
		return "Student2{" + "rollno=" + rollno + ",marks=" + marks +'}';
	}
	
	public int compareTo(Student2 s)
	{
		return this.marks > s.marks ? -1 :this.marks < s.marks ? 1 : 0;
	}
}