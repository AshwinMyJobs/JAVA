package javacodes.threads.callable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class MainClass {

	public static void main(String[] args) throws ExecutionException, InterruptedException {

//        List<Future<Integer>> futureSum = new ArrayList<>();
//
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//
//        for (int i = 0; i < 100; i++) {
//            AdditionCallableThread additionThread = new AdditionCallableThread(1, 1);
//            Future sum = executorService.submit(additionThread);
//            futureSum.add(sum);
//            System.out.println("Repeating the loop.......");
//        }
//
//        System.out.println("futureSum.get(i).get() loop will run now .......................................................................................................");
//        for (int i = 0; i < 100; i++) {
//            System.out.println("futureSum.get("+i+") :" + futureSum.get(i).get());
//        }
//
//        executorService.shutdown();

		CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Hello");
		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "Beautiful");
		CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> "World");

		CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(future1, future2, future3);

		combinedFuture.get();

		System.out.println(future1.get());
		System.out.println(future2.get());
		System.out.println(future3.get());
		
		CompletableFuture<Integer> completableFuture1 = CompletableFuture.supplyAsync(()->{
			return 10;
		});
		CompletableFuture<Integer> completableFuture2 = CompletableFuture.supplyAsync(()->{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			return 20;
		});
		CompletableFuture<Integer> completableFuture3 = CompletableFuture.supplyAsync(()->{
			return 30;
		});

		System.out.println(completableFuture1.get());
		System.out.println(completableFuture2.get());
		System.out.println(completableFuture3.get());

	}
}
