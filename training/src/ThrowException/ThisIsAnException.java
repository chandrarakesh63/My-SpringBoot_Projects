package ThrowException;

public class ThisIsAnException extends Exception{
	
	public ThisIsAnException(String s)
	{
		super(s);
		System.out.println(s);
	}
	
	}


