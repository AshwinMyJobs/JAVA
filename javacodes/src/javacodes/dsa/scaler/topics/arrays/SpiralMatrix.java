package javacodes.dsa.scaler.topics.arrays;

public class SpiralMatrix {

	public static void main(String[] args) {

	}

	public static void spiralMatrix(int[][] A) {
		int n = A.length;
		int m = A[0].length;
		int rmin = 0, rmax = A.length-1;
		int cmin = 0, cmax = A[0].length-1;
		
		int count = 0;
		
		while(count < n*m) {
			//top boundary
			for(int col=cmin; col<=cmax && count<n*m; col++) {
				System.out.println(A[rmin][col]);
				count++;
			}
			rmin++;
			//right boundary
			for(int row=rmin; row<=rmax && count<n*m; row++) {
				System.out.println(A[row][cmax]);
				count++;
			}
			cmax--;
			//bottom boundary
			for(int col=cmax; col<=cmin && count<n*m; col--) {
				System.out.println(A[rmax][col]);
				count++;
			}
			rmax--;
			//left boundary
			for(int row=rmax; row>=rmin && count<n*m; row--) {
				System.out.println(A[row][cmin]);
				count++;
			}
			cmin++;
		}
	}
}
