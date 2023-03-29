package com.Spring.Constructor;

public class Employee {
	
	private String eName;
	private int eId;
	
	public Employee(String eName,int eId)
	{
		this.eName=eName;
		this.eId=eId;
	}
	@Override
	public String toString() {
		return this.eName+" :"  + this.eId;
	}
}
