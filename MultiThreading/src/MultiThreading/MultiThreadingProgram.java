
package MultiThreading;

public class MultiThreadingProgram extends Thread{

	
	String name="Rakesh chandra Mohanty";
	@Override
	public  synchronized void run() {
		
			for(int i=0;i<10;i++)
			{
				try {
				
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Child Thread " + name);
			}
	}
}
