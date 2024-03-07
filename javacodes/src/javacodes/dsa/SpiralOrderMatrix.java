package javacodes.dsa;

public class SpiralOrderMatrix {

	public static void main(String[] args) {
		spiralOrderMatrix(4);

	}

	public static void spiralOrderMatrix(int A) {
		
		int r = 0;
		int c = 0;
		int number = 1;
		
		int[][] intArray = new int[A][A];
		
		while(A>1) {
			
			for(int i=1; i<A; i++) {
				intArray[r][c] = number;
				c++;
				System.out.print(number);
				number++;
			}
			System.out.println();
			for(int i=1; i<A; i++) {
				intArray[r][c] = number;
				r++;
				System.out.print(number);
				number++;
			}
			System.out.println();
			for(int i=1; i<A; i++) {
				intArray[r][c] = number;
				c--;
				System.out.print(number);
				number++;
			}
			System.out.println();
			for(int i=1; i<A; i++) {
				intArray[r][c] = number;
				r--;
				System.out.print(number);
				number++;
			}
			System.out.println();
			r++;
			c++;
			A = A - 2;
		}
		
		if(A==1) {
			intArray[r][c] = number;
			System.out.print(number);
		}
		
	}
}