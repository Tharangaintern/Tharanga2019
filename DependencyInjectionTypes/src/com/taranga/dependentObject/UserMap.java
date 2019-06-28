package com.taranga.dependentObject;

public class UserMap {
private int id;
private String name,email;

public UserMap(int id, String name, String email) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
}

@Override
public String toString() {
	return " [id=" + id + ", name=" + name + ", email=" + email + "]";
}


}
