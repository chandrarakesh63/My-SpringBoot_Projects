package QuestionNo21;

public class MultipleCatchBLock {
	
	public static void main(String[] args) {
		try {
			int a=12;
			int b=0;
			int c=a/b;
		}
		catch(ArithmeticException a)
		{
			System.out.println("Hiii this is Arithmetic exception");
		}
		catch(Exception e)
		
		{
			System.out.println("This is the first catch block");
		}
		
	}

}
