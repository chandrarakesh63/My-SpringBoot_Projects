package MultiThreading;

public class MainThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		MultiThreadingProgram mtp= new MultiThreadingProgram();
		mtp.start();
		
		for (int i=0; i<10; i++)
		{
			
			Thread.sleep(200);
			System.out.println("Main Thread ");
		}
		
	}

}
