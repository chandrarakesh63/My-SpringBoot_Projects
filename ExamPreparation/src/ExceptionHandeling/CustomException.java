package ExceptionHandeling;

public class CustomException {
	
	public static void main(String[] args) throws Exception {
		int age=13;
		if(age<18)
		{
			throw new MyException("jdjdhdhhjdjd");
		}
		else {
			System.out.println("not a age");
		}	
	}
}
	class MyException extends Exception{
		
		public MyException(String massage) {
			
			super(massage);
		}
	}
