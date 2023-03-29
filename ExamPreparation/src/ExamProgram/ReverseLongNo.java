package ExamProgram;

public class ReverseLongNo {
	
	public static void main(String[] args) {
		long a=45678909;
		long sum=0,rev=0;
		
		while(a>0)
		{
			rev=a%10;
			sum= (sum*10)+rev;
			a=a/10;
			System.out.print(rev);
		}
		
		
		
		
	}

}
