package BuilderProgram2;

public class MyClasssBuilder {
	
	
	private String name;
	private int age;
	
	 MyClasssBuilder(String name,int age) {

		 this.name=name;
		 this.age=age;
		 
	}

	public MyClasssBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public MyClasssBuilder setAge(int age) {
		this.age = age;
		return this;
	}
	public MyClass builderData()
	{
		return new MyClass(name, age);
	}
	 
	

}
