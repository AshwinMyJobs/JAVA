package javacodes.dsa;

public class SetBit {

	public static void main(String[] args) {

		int n = solve(3, 5);
		
		System.out.println(n);
	}

	public static int solve(int A, int B) {
		
		int n = 0;
		
		n = n | 1<<A;
		n = n | 1<<B;
		
		return n;
	}
}
