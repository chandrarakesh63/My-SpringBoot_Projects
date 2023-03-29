package MappingPackage;

import java.util.List;

public class Employee {
	
	private int id;
	private String name;
	private String depart;
	private List<String> roles;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String depart, List<String> roles) {
		super();
		this.id = id;
		this.name = name;
		this.depart = depart;
		this.roles = roles;
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
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", depart=" + depart + ", roles=" + roles + "]";
	}
	 

}
