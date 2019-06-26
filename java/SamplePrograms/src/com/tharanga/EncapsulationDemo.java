package com.tharanga;

public class EncapsulationDemo {

	public static void main (String[] args){
		Emp e1 = new Emp();
		e1.setEmpId(3);
		e1.setEmpName("Kavya");
		Emp e2 = new Emp();
		e2.setEmpId(5);
		e2.setEmpName("Divya");
		Emp e3 = new Emp();
		e3.setEmpId(8);
		e3.setEmpName("Savita");
		
		System.out.println(e3.getEmpName());
	}
	
}
class Emp
{
private int empId;
private String empName;

public int getEmpId(){
	return empId;
}
public void setEmpId(int empId){
	this.empId=empId;
}
public String getEmpName(){
	return empName;
}
public void setEmpName(String empName){
	this.empName=empName;
}
}