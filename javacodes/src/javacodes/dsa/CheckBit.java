package javacodes.dsa;

public class CheckBit {

	public static void main(String[] args) {

		int n = solve(5, 2);
		
		System.out.println(n);
	}

	public static int solve(int A, int B) {
		
		A = A & 1<<B;
		
		if(A!=0)
			return 1;
		else
			return 0;

	}
}
