package javacodes.dsa;

public class SetRowColumnsToZero {

	public static void main(String[] args) {

	}

	private static void solve(int[][] matrix) {

		int n = matrix.length;
		int m = matrix[0].length;

		int[] rows = new int[n];
		int[] cols = new int[n];

		// First get info of the row/col index having zero elements
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (matrix[i][j] == 0) {
					rows[i] = 1;
					cols[i] = 1;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				// Mark cells zero if any of the row[i] or col[j] is 1
				if (rows[i] == 1 || cols[j] == 1)
					matrix[i][j] = 0;
			}
		}

	}
}
