package JPA_Project.com.Motivity.JPA;

import javax.persistence.Entity;
import javax.persistence.Id;


public class Employee {
	
	private int eId;
	private String eName;
	private String email;
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", email=" + email + "]";
	}
	
	
	
	

}
