package GroupedByPrograms;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	
	private int age;
	private String name;
	private String email;
	
	public Employee(int age, String name, String email) {
		super();
		this.age = age;
		this.name = name;
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee() {
		super();
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", email=" + email + "]";
	}
	
	

}
