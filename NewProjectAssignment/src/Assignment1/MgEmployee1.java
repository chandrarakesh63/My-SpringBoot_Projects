package Assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MgEmployee1 {
	
	int id;
	String name;
	 int salary;
	
	MgEmployee1(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	public static MgEmployee1 MgEmployee1(int i, String string, int j) {
		return null;
	}


	@Override
	public String toString() {
		return "MgEmployee1 [id=" + id + ", name=" + name + ", salary=" + salary + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getSalary()=" + getSalary() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
		
	}




