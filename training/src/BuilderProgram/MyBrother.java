package BuilderProgram;

public class MyBrother {
	
	
	private String name;
	private String adress;
	private int age;
	
	public MyBrother(String name, String adress, int age) {
		
		this.name = name;
		this.adress = adress;
		this.age = age;
	}
	@Override
	public String toString() {
		return "MyBrother [name=" + name + ", adress=" + adress + ", age=" + age + "]";
	}
	

}
