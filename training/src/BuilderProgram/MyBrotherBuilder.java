package BuilderProgram;

public class MyBrotherBuilder {
	
	private String name;
	private String adress;
	private int age;
	public MyBrotherBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public MyBrotherBuilder setAdress(String adress) {
		this.adress = adress;
		return this;
	}
	public MyBrotherBuilder setAge(int age) {
		this.age = age;
		return this;
	}
	public MyBrother builderData() {
		return new MyBrother(name, adress, age);
		
	}
	
	

}
