package javacodes.threads.callable;

import java.util.concurrent.Callable;

public class AdditionCompletableFutureThread implements Callable{

    private int a;
    private int b;

    public AdditionCompletableFutureThread(int i, int j) {
		this.a = i;
		this.b = j;
	}

    @Override
    public Object call() throws Exception {
        System.out.println( "Addition of " + a + " and " + b + " is " + ( a + b ) + " By Thread " + Thread.currentThread().getName());
        if(a==999) Thread.sleep(1000);
        return a + b;
    }

}
