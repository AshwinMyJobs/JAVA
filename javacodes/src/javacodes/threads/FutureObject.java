package javacodes.threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureObject {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		Future<List<Integer>> future1 = executorService.submit(()->{
			System.out.println("Current Thread Name : " + Thread.currentThread().getName());
			//Thread.sleep(5000);
			return Arrays.asList(1,2,3,4,5);
		});
		
		Future<List<Integer>> future2 = executorService.submit(()->{
			System.out.println("Current Thread Name : " + Thread.currentThread().getName());
			//Thread.sleep(3000);
			return Arrays.asList(100,200,300,400,500);
		});
		
		System.out.println("Main thread is running here .....");
		
		List<Integer> futureList1 = future1.get();
		System.out.println(futureList1);
		List<Integer> futureList2 = future2.get();
		System.out.println(futureList2);

		executorService.shutdown();
	}

	
}
