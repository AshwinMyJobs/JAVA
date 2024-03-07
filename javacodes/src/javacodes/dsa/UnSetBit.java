package javacodes.dsa;

public class UnSetBit {

	public static void main(String[] args) {

		int n = solve(417, 5);
		System.out.println(Integer.toBinaryString(n));
	}

	public static int solve(int A, int B) {
		int n = A;
		n = n & 1<<5;
		System.out.println(Integer.toBinaryString(n));
		if(n!=0)
			A = A ^ 1<<B;
		return A;
	}
}
