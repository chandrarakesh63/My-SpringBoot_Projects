package Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPoolProgram {
	
	public static void main(String[] args) {
		
	
	ExecutorService service =Executors.newSingleThreadExecutor();
	
	Runnable x= () -> {
		for (int i=1 ; i<4; i++)
		{
			System.out.println(Thread.currentThread().getName());
			System.out.println("Riku");
		}	
	};
	service.execute(x);

	}
}
