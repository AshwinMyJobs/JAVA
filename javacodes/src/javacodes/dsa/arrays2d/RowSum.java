package javacodes.dsa.arrays2d;

public class RowSum {

	public static void main(String[] args) {

	}

	public static int[] solve(int[][] A) {
	
		int row = A.length;
		int col = A[0].length;
		
		int sum = 0;
		
		int[] outputArray = new int[row];
		
		for(int i=0; i<row; i++) {
			sum = 0;
			for(int j=0; j<col; j++) {
				sum = sum + A[i][j];
			}
			outputArray[i] = sum;
		}
		
		return outputArray;
    }
}
