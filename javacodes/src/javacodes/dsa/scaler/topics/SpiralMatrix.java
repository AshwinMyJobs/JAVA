package javacodes.dsa.scaler.topics;

public class SpiralMatrix {

	public static void main(String[] args) {
		
		int[][] input = {
				{1,2,3,4,5,0},
				{6,7,8,9,10,0},
				{11,12,13,14,15,0}
		};
		printSprialMatrix(input);

	}
	
	private static void printSprialMatrix(int[][] A) {
		int n = A.length;
		int m = A[0].length;
		
		int rmin = 0, rmax = A.length-1;
		int cmin = 0, cmax = A[0].length-1;
		
		int count = 0;
		
		while(count<n*m) {
			
			//top boundary
			for(int col=cmin; col<=cmax && count<n*m; col++ ) {
				System.out.print(A[rmin][col] + " ");
				count++;
			}
			rmin++;	
			//right boundary
			for(int row=rmin; row<=rmax && count<n*m; row++) {
				System.out.print(A[row][cmax] + " ");
				count++;
			}
			cmax--;
			//bottom boundary
			for(int col=cmax; col>=cmin && count<n*m; col--) {
				System.out.print(A[rmax][col] + " ");
				count++;
			}
			rmax--;
			//left boundary
			for(int row=rmax; row>rmin && count<n*m; row--) {
				System.out.print(A[row][cmin] + " ");
				count++;
			}
		}
	}

}
