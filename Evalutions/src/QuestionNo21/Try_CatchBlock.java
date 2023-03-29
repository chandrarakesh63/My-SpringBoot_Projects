package QuestionNo21;

public class Try_CatchBlock {

public static void main(String[] args) {
		
		try {
			int a=12;
			int b=0;
			int c=a/b;
			
			System.out.println("This is the try block");
			
		}
		catch(Exception e)
		{
			System.out.println("This is the catch block");
		}
	}
}
