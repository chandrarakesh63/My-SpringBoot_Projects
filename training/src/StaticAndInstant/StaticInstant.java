package StaticAndInstant;

public class StaticInstant {
	public void method()
	{
		System.out.println("This is the instance method invoke");
	}
	public static void method1()
	{
		System.out.println("This is the static method called");
	}
	public static void main(String[] args) {
		method1();
		StaticInstant si=new StaticInstant();
		si.method();
		
	}

}
