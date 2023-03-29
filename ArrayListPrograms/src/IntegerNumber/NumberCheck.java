package IntegerNumber;

public class NumberCheck {
	
	public static void main(String[] args) {
		
		Integer i1=4;
		methodCheck(i1);
		
	} 
	public static void methodCheck(Object o)
	{
		System.out.println("Object");
	}
	public static void methodCheck(Number n)
	{
		System.out.println("Number");
	}
		
}
