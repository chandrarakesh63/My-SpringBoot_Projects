package Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
	
	
	public static void main(String[] args) {
		
		ExecutorService service = Executors.newCachedThreadPool();
		
		Runnable r = () -> {
			for(int i=1; i<4; i++)
			{
				System.out.println(Thread.currentThread().getName());
				System.out.println("Rakesh");
			}
		};
		
		Runnable r1 = () -> 
		{
			for(int i=1;i<3;i++)
			{
			System.out.println(Thread.currentThread().getName());
			System.out.println("Riku");
			}
		};
		
		service.execute(r);
		service.execute(r1);
		
	}

}
