package javacodes.dsa.maths;

import java.util.Arrays;
import java.util.Iterator;

public class FindAllPrimes {

	public static void main(String[] args) {

		findAllPrimes(16);
		

	}

	
	private static void findAllPrimes(int A) {
	
		int limit = (int)squareRoot(A);
		
		boolean[] booleanArray = new boolean[A];
		Arrays.fill(booleanArray, true);

		for(int i=2; i<=limit; i++) {
			for(int j=i+i; j<=A; j=j+2) {
				booleanArray[j] = false;
			}
		}
		System.out.println();
	}
	
	private static double squareRoot(int i) {
		
		return Math.sqrt(i);
	}
}
