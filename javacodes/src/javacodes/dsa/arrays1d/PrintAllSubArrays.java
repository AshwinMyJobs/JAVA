package javacodes.dsa.arrays1d;

public class PrintAllSubArrays {

	public static void main(String[] args) {

		int[] A = { 1, 2, 3, 4, 5 };

		int count = -1;
		while (count < A.length) {
			count++;
			for (int i = 0; i < A.length; i++) {
				System.out.println();
				for (int j = count; j <= i; j++) {
					System.out.print(A[j]);
				}
			}
		}
	}
}