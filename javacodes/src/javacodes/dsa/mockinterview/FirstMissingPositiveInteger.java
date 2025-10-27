package javacodes.dsa.mockinterview;

import java.util.HashMap;
import java.util.Set;

public class FirstMissingPositiveInteger {

	public static void main(String[] args) {
		int[] A = {1,5,9,4,3};
		System.out.println(missingPositiveInteger(A));
			
	}

	private static int missingPositiveInteger(int[] A) {
		
		int[] tempArray = new int[A.length];
		
		for(int i=0; i<A.length; i++) {
			if(A[i]>=0 && A[i]<A.length) {
				tempArray[A[i]] = A[i];
			}
		}
		
		for(int i=1; i<A.length; i++) {
			if(tempArray[i]!=i) return i;
		}
		return -1;
	}
}
