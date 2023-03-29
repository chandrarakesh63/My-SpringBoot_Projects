package Opps;

public class Child extends Parent{
	public void method1()
	{
		int a=54;
		int b=47;
		int mul=a*b;
		System.out.println("Multiplication of " +a+ "  and  " +b+ " is " +mul);
	}
	public void method1(int a)
	{
		String name="Bikash Ranjan Mohanty";
		int age =24;
		char fLetter='B';
		System.out.println("My name is "+name + "  My age is "+ age +"  My Name first letteris " + fLetter);
	}
	public static void main(String[] args) {
		Parent c =new Child();
		c.method1();
		c.method1(12);
		
	}

}
