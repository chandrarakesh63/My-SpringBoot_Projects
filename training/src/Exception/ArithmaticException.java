package Exception;

public class ArithmaticException {
	public static void main(String[] args){
		try {
		int number=24;
		int number2=0;
		int answer=number/number2;
		System.out.println(answer);
		}
		catch(Exception e) {
			System.out.println("Please don't devide by 0");
		}
		}
	}
