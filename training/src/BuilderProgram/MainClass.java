package BuilderProgram;

public class MainClass {
	
	public static void main(String[] args) {
		BuilderProgram1 b1=new BuilderClass().setAdress("hyderabad").setName("Rakesh").setAge(23).getBuilderProgram1();
		System.out.println(b1);
		
		MyBrother mb= new MyBrotherBuilder().setAdress("Odisha").setName("BIkash").setAge(25).builderData();
		System.out.println(mb);
	}

}
