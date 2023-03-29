package Opps;

public class MethodOverloading {
	
	public static void method()
	{
		System.out.println("This is the without parameterised method ");
	}
	public static void method(int a)
	{
		System.out.println("This is the int type parameterised method ");
	}
	public void method (double b , char c)
	{
		System.out.println("This is the double type and character type parameterised method ");
	}
	public static void main(String[] args) {
		
	method();
	method(23);
	MethodOverloading m=new MethodOverloading();
	m.method(23.4,'d');
	}
}
