package BuilderProgram;

public class BuilderClass {

	private String name;
	private String adress;
	private int age;
	public BuilderClass setName(String name) {
		this.name = name;
		return this;
	}
	public BuilderClass setAdress(String adress) {
		this.adress = adress;
		return this;
	}
	public BuilderClass setAge(int age) {
		this.age = age;
		return this;
	}
	public BuilderProgram1 getBuilderProgram1()
	{
		return new BuilderProgram1(name, adress, age);
	}
	public MyBrother getMyBrother()
	{
		return new MyBrother(name, adress, age);
	}
}
