package javacodes.dsa.arrays1d;

public class SumOfAllSubArrays {

	public static void main(String[] args) {
		int[] input = { 1, 2, 3 };

		System.out.println("Sum of all subarray is : " + solve(input));

	}

	private static int solve(int[] A) {

		int sum = 0;

		for (int i = 0; i < A.length; i++) {

			sum = sum + A[i] * (i + 1) * (A.length - i);
		}
		return sum;
	}
}
