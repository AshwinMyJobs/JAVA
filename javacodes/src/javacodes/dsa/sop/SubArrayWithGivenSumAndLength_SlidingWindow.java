package javacodes.dsa.sop;

public class SubArrayWithGivenSumAndLength_SlidingWindow {

	public static void main(String[] args) {

		int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sumInput = 27;
		int lengthInput = 3;

		System.out.println(solve(A, sumInput, lengthInput));
	}

	public static boolean solve(int[] A, int sumInput, int lengthInput) {

		if (A.length < lengthInput)
			return false;

		int sum = 0;

		for (int i = 0; i < lengthInput; i++) {
			sum = sum + A[i];
		}

		if (sum == sumInput)
			return true;

		int index1 = -1;
		int index2 = 2;

		while (index2 < A.length) {
			index1++;
			index2++;
			sum = sum + A[index2] - A[index1];
			if (sum == sumInput) return true;

		}

		return false;
	}
}
