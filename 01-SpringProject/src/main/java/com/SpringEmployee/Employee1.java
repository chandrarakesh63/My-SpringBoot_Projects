package com.SpringEmployee;

import java.util.List;

public class Employee1 {
	
	private List<String> employee;
	private int fId;
	private String firstName;
	private String lastName;
	private String phno;
	private String Address;
	private double salary;
	private String dept;

	public int getfId() {
		return fId;
	}
	public void setfId(int fId) {
		this.fId = fId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Employee1 [employee=" + employee + ", fId=" + fId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", phno=" + phno + ", Address=" + Address + ", salary=" + salary + ", dept=" + dept + "]";
	}
	public List<String> getEmployee() {
		return employee;
	}
	public void setEmployee(List<String> employee) {
		this.employee = employee;
	}

}
