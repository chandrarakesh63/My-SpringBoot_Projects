package StreamProgram;

public class MethodRecurson {
	
	static int i=1;
	
	public static void m()
	{
		if (i>100) {
			return;
		 }
		
		System.out.println(i++ +" ");
		m();
	}
	
	public static void main(String[] args) {
		m();
	}
}
