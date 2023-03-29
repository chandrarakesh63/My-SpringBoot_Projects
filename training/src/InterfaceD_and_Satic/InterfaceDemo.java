package InterfaceD_and_Satic;

public interface InterfaceDemo {
	public default void method()
	{
		System.out.println("This is the default method");
	}

	public static void method2()
	{
		System.out.println("This is the static method");
	}

}
