package javacodes.dsa.arrays2d;

public class MatrixScalarProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[][] solve(int[][] A, int B) {

	        for(int i=0; i<A.length; i++) {
	        	for(int j=0; j<A[0].length; j++) {
	        		A[i][j] = A[i][j]*B;
	        	}
	        }
	        return A;
	}
}
