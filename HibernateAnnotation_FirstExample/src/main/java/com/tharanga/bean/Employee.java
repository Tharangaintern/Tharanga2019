package com.tharanga.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employeeannotation")
public class Employee {
@Id
	private int id;
@Column(name="firstname")
	private String fname;
@Column(name="lastname")
private String lname;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String firstname) {
	this.fname = firstname;
}
public String getLname() {
	return lname;
}
public void setLname(String lastname) {
	this.lname = lastname;
}
	
	
}
