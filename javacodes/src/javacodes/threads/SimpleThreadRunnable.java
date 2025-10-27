package javacodes.threads;

public class SimpleThreadRunnable implements Runnable{

    private int i;

    public SimpleThreadRunnable(int i) {
        this.i = i;
    }

    @Override
    public void run() {
            System.out.println("I is : " + i + " , Thread running is " + Thread.currentThread().getName());
    }
}
