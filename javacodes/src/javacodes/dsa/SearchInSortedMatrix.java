package javacodes.dsa;

public class SearchInSortedMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intArray[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		int ans = searchInSortedMatrix(intArray, 2);
		System.out.println(ans);

	}

	private static int searchInSortedMatrix(int[][] A, int B) {

		int ans = Integer.MAX_VALUE;
		int i = 0;
		int j = A[0].length-1;

		while (i < A.length && j >= 0) {
			if (A[i][j] == B) {
				i++;j++;
				if (ans > (1009 * i + j))
					ans = 1009 * i + j;
			}
			if (A[i][j] >= B)
				j--;
			else
				i++;
		}
		if (ans == Integer.MAX_VALUE)
			return -1;
		else
			return ans;
	}
}
