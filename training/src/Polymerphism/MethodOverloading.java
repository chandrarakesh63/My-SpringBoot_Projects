package Polymerphism;

public class MethodOverloading {
	public static void test()
	{
		System.out.println("This is the no parameterised method");
	}
	public static void test(int a)
	{
		System.out.println("This is the one parameterised method");
	}
	public static void test(double a)
	{
		System.out.println("This is the one double type parameterised method");
	}
	public static void test(int a,double b)
	{
		System.out.println("This is the one parameterised method");
	}
	public static void main(String[] args) {
		test();
		test(19);
		test(39.89);
		test(29,39.9);
	}

}
