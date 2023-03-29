package MultiThreading;

public class TwoThreadAnotherWay extends Thread{
	
	public static void main(String[] args) {
		TwoThreadAnotherWay t1= new TwoThreadAnotherWay();
		t1.start();
		
		for(int i=1;i<5;i++)
		{
			System.out.println("Heeee");
		}
	}
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println("Hoooii");
		}
	}
	
}
