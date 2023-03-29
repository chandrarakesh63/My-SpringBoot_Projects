package CustomExceotion;

public class NameNotValidException extends Exception {
	
	public NameNotValidException(String record)
	{
		super (record);
	}

}
