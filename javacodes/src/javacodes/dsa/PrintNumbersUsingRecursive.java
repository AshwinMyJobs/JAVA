package javacodes.dsa;

public class PrintNumbersUsingRecursive {

	public static void main(String[] args) {
		printNumbers(50);
	}

	private static void printNumbers(int A) {
		if (A <= 0) {
			return;
		}
		printNumbers(A - 1);
		System.out.print(A + " ");
	}
}
