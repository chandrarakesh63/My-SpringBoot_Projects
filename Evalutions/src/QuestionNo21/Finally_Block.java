package QuestionNo21;

public class Finally_Block {
	
	public static void main(String[] args) {
		try {
			int a=12;
			int b=0;
			int c=a/b;
		}
		
		finally
		{
			System.out.println("This block will be exicute compolsory");
		}
		}

}
