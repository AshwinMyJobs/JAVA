package javacodes.dsa;

public class FibNthValue {
	public static void main(String[] args) {
		System.out.println(fib(10));
	}
	private static int fib(int A) {
		if(A<=1) return A;
		else return fib(A-1) + fib(A-2);
	}
}
