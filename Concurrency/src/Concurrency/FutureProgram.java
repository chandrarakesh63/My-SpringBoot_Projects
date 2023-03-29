package Concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FutureProgram implements Callable<Integer>{
	
	ExecutorService es= Executors.newFixedThreadPool(3);
	
	@Override
	public Integer call() throws Exception {
		
		
		
		return null;
	}

}
