package StreamAPI;

public class Employee {
	
	private String name;
	private float salary;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(String name, float salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	public Employee() {
		super();
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}

}
