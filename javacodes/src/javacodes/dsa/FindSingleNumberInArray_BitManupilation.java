package javacodes.dsa;

import java.util.Iterator;

public class FindSingleNumberInArray_BitManupilation {

	public static void main(String[] args) {
		int[] inputArray = {1,2,3,4,1,2,3};
		System.out.println(singleNumber(inputArray));

	}

	private static int singleNumber(final int[] A) {
		
		int xor = A[0];
		
		for(int i=1; i<A.length; i++) {
			xor = xor ^ A[i];
		}
		
		return xor;
    }
}
