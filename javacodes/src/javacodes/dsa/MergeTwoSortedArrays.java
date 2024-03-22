package javacodes.dsa;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {

		int[] A = { 1, 2, 3, 4, 4 };
		int[] B = { 2, 4, 5, 5 };

		mergeSortedArrays(A, B);

		int[] outputArray = new int[A.length + B.length];

		outputArray = A;

		int x = outputArray.length;

		System.out.println(x);

	}

	private static int[] mergeSortedArrays(int[] A, int[] B) {

		int[] ansArray = new int[A.length + B.length];

		if (A[0] > B[0]) {
			int i = 0;
			while (i < B.length) {
				ansArray[i] = B[i];
				i++;
			}
			while (i < ansArray.length) {
				ansArray[i] = A[i - B.length];
				i++;
			}
		} else if (B[0] > A[0]) {
			int i = 0;
			while (i < A.length) {
				ansArray[i] = A[i];
				i++;
			}
			while (i < ansArray.length) {
				ansArray[i] = B[i - A.length];
				i++;
			}
		}
		return ansArray;
	}

	public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3) {
		int i = 0, j = 0, k = 0;


		while (i < n1 && j < n2) {

			if (arr1[i] < arr2[j])
				arr3[k++] = arr1[i++];
			else
				arr3[k++] = arr2[j++];
		}

		while (i < n1)
			arr3[k++] = arr1[i++];

		while (j < n2)
			arr3[k++] = arr2[j++];
	}
}
