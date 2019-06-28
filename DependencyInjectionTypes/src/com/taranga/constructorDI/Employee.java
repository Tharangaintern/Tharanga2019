package com.taranga.constructorDI;

public class Employee {  
private int id;  
private String name;  
private int age; 


public Employee() {System.out.println("defalt cons. ..");}  
  
public Employee(int id) {
	this.id = id;
	}  
  
public Employee(String name) {
	this.name = name;
	}  


  
public Employee(int id, String name,int age) {  
    this.id = id;  
    this.name = name; 
    this.age=age;
}  
  

void show(){  
    System.out.println("Id="+id+"  "+"Name="+name+"  "+ "Age="+age);  
}  
  
}  
