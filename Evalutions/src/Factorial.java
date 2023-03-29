
public class Factorial {

	public static void main(String[] args) {
		System.out.println(Factorial(4));
	}

	public static String Factorial(int a)
	
	{
		int fact=1;
		for (int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		return(" functional of the number : " +fact);
	}
}
