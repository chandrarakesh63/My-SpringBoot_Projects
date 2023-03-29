package ExamProgram;

public class AmstrongNumber {
	public static void main(String[] args) {

		int a = 153;
		int result= 0;
		int rest = a;
		
		while(a > 0) {
			int temp = a%10;
			result += Math.pow(temp,3);
			a =a/10;
			
		}
		
		System.out.println(rest == result);
	}
}
