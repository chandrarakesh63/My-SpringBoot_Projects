package QuestionNo21;

public class Throw_keyword {
	
	public static void main(String[] args) throws Exception{
		try {
			int a=12;
			int b=0;
			int c=a/b;
		}
		catch(Exception e)
		{
		throw new ThrowParent("This is my exception");
			
		}
	}
}
