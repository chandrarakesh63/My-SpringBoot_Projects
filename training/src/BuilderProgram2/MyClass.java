package BuilderProgram2;

public class MyClass {
	
	private String name;
	private int age;
	public MyClass(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}
	public void setName()
	{
		this.name=name;
		
	}
	public void setAge()
	{
		this.age=age;
		
	}
	@Override
	public String toString() {
		return "MyClass [name=" + name + ", age=" + age + "]";
	}
	
	

}
