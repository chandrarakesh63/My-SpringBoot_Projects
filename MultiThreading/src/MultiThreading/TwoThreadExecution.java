package MultiThreading;

public class TwoThreadExecution implements Runnable{
	
	public static void main(String[] args) {
		
		TwoThreadExecution t1= new TwoThreadExecution();
		t1.run();
		
		for(int j=1;j<5;j++)
		{
			System.out.println("Hello");
		}
		
	}

	@Override
	public void run() {

		for(int i=1; i<5; i++)
		{
			System.out.println("Hiii");
		}
	}

}
