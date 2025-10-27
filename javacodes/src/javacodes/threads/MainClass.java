package javacodes.threads;

import java.util.concurrent.ExecutorService;

public class MainClass {

    public static void main(String[] args) throws  InterruptedException{

        for( int i=0; i<10; i++) {
            Thread t1 = new Thread(new SimpleThreadRunnable(i));
            t1.start();
            //t1.join();
            //Thread.sleep(1000);
            t1.join();
        }

        System.out.println("With Executor Service");
        //With Executor srvice
        ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(10);
        for( int i=100; i<110; i++) {
            executorService.submit(new SimpleThreadRunnable(i));
        }
        executorService.shutdown();
    }
}
