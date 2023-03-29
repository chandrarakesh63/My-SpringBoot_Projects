package ExamProgram;

public class PrimeNo {
	
	public static void main(String[] args) {
		
		int n=2;
		int i=0;
		for(i=2; i<n; i++) {
			if(n%2 == 0) {
				break;
			}
		}
		
		if(i == n) {
			System.out.println("prime");
		}
		else {
			System.out.println("Not Prime");
		}
		
	}

}
