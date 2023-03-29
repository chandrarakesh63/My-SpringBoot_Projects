package Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorProgram {
	
	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService service= Executors.newFixedThreadPool(1);
		
		
		Runnable r= ()->{
		for (int i=1; i<3 ; i++)
		{
			System.out.println(Thread.currentThread().getName());
				System.out.println(i);
		}
		};
		
		Runnable r1= ()->{
			for(int i=1; i<3; i++)
			{
			System.out.println(Thread.currentThread().getName());
			System.out.println("Rakesh");
			
			}
			};
			
		Runnable r2 = ()->{
			for(int i=1; i<3; i++)
			{
				System.out.println(Thread.currentThread().getName());
				System.out.println("Bikash ");
			}

		};
		service.execute(r);
		service.submit(r1);
		service.submit(r2);
		service.shutdown();
		service.awaitTermination(5, TimeUnit.SECONDS);
		

	}
}
