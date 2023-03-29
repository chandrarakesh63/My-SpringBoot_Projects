package InterfaceD_and_Satic;

public class Test implements InterfaceDemo{
	@Override
	public void method()
	{
		System.out.println("This is the default method overrided");
	}

	public static void method2()
	{
		System.out.println("This is the static method overrided");
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.method();
		t.method2();
	}

}
