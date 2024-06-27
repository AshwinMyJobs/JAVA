package javacodes.dsa.arrays2d;

import java.util.ArrayList;
import java.util.List;

public class AddTheMatrices {

	public static void main(String[] args) {

	}
	public static int[][] solve(int[][] A, int[][] B) {
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[0].length; j++) {
				A[i][j] = A[i][j] + B[i][j];
			}
		}
		return A;
    }
}
