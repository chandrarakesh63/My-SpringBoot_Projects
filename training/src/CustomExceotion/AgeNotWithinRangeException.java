package CustomExceotion;

public class AgeNotWithinRangeException extends Exception {
	
	public AgeNotWithinRangeException(String record)
	{
		super(record);
	}

}
