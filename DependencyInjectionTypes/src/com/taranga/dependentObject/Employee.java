package com.taranga.dependentObject;

public class Employee {
	private int id;
	private String name;
	private Address addr;

	public Employee() {
		System.out.println("default const..");
	}
public Employee(int id ,String name, Address addr ) {
	this.id=id;
	this.name=name;
	this.addr=addr;
	}

public void print() {
	System.out.println("id="+id+" "+"Name=" +name);
	System.out.println(addr.toString());
}

}
