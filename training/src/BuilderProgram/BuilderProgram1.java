package BuilderProgram;

public class BuilderProgram1{
	
	
	private String name;
	private String adress;
	private int age;
	
	
	public  BuilderProgram1(String name,String adress,int age) {
		
		this.name=name;
		this.adress=adress;
		this.age=age;
	}


	@Override
	public String toString() {
		return "BuilderProgram1 [name=" + name + ", adress=" + adress + ", age=" + age + "]";
	}


	
	
	

}
