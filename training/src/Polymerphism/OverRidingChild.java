package Polymerphism;

public class OverRidingChild extends MethodOverRiding{
	public void method1(int c)
	{
		System.out.println("This is the child class method");
	}
	public void method(int a,int b)
	{
		System.out.println("This is the child class method");
	}

	public static void main(String[] args) {
		MethodOverRiding or=new OverRidingChild();
		or.method1(12);
		or.method(12,23);
	}
}
