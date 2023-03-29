package AbstractProgram;

public class Abstract1 extends Abstract{
	public void enginee()
	{
		System.out.println("Enginee method invoked");
	}
	public static void main(String[] args) {
		Abstract1 a=new Abstract1();
		a.bike();
		a.enginee();
	}

}
