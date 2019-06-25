package com.tharanga.model;


import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.type.SerializableType;

@Entity
@Table(name="emp")
public class Employee  implements Serializable{
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="EmpName")
    private String ename;
	
	@Column(name="Salary")
	private int sal;
   
	@Column(name="Job")
	private String job;
    
	@Column(name="DeptNo")
	private int deptno ;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	

}
