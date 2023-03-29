package Concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {
	
	public static void main(String[] args) {
		
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		
		Runnable x= ()-> {
			for(int i=1;i<=10;i++)
			{
				int multiple=i*12;
				System.out.println(Thread.currentThread().getName());
				System.out.println("Table of 12 *"+i+ " is "+multiple);
			}
		};
		Runnable y= ()->{
			for (int i=1; i<=10;i++) {
				int sum=i+12;
				System.out.println(sum);
			}
		};
		
		
		service.schedule(x, 5, TimeUnit.SECONDS);
		service.scheduleAtFixedRate(y, 2, 1, TimeUnit.SECONDS);
		//service.shutdown();
		//service.isTerminated();
		
	}

}
