package Inheritance;

public class child extends Parent{
	public static void childMethod()
	{
		System.out.println("My age and my Brother's total age is");
	}
	public static void main(String[] args) {
		childMethod();
		Parent p=new Parent();
		p.parentMethod();
		
	}

}
