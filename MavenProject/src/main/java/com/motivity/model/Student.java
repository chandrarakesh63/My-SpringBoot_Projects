package com.motivity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student1")
public class Student {
	
	@Id
	@GeneratedValue
	private int sid;
	private int rollNo;
	private String sname;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public Student(int sid, int rollNo, String sname) {
		super();
		this.sid = sid;
		this.rollNo = rollNo;
		this.sname = sname;
	}
	
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", rollNo=" + rollNo + ", sname=" + sname + "]";
	}
	
	

}
