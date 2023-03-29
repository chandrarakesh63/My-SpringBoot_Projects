package ExamProgram;

public class PalendromeNo {
	public static void main(String[] args) {
		
		int a=121;
		int digit;
		int copy=a;
		int rev=0;	
		do
		{
			digit=a%10;
			rev=rev*10+digit;
			a=a/10;
			//System.out.print(digit);	
		}
		while(a!=0);
		if(rev==copy)
		{
			System.out.println(copy+ "  is a palendrome");
		}
		else 
		{
			System.out.println(copy+"  Not a palendrome number");
		}
	}

}
