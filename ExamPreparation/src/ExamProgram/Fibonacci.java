package ExamProgram;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int c;
		System.out.print(a + " " + b + " ");
		for (int i=1;i<5;i++)
		{
			c=a+b;
			
			a = b;
			b = c;
			System.out.print(c + " ");
			
		}	
	}
	

}
