package javacodes.dsa.scaler.topics.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

	public static void main(String[] args) {
//		int[] input1 = {11,3,8,10,18,12};
//		towSum(input, 12);
		
		//1.BruteForce : TC = O(N*N)
		int[] input1 = {1,2,3,4,5};
		twoSumBruteForceMethod(input1, 5);
		
		//2.Optimized : TC = O(N)
		int[] input2 = {11,3,8,10,18,12};
		towSum(input2, 12);
	}

	private static void towSum(int[] A, int target) {
		
		Map<Integer, Integer> indexMap = new HashMap<>();
		boolean isPresent = false;
		for(int i=0; i<A.length; i++) {
			int num1 = A[i];
			if(indexMap.containsKey(target-num1)) {
				System.out.println("Two sum indexes are : " + i +" and " + indexMap.get(target-num1));
				isPresent = true;
				break;
			}else {
				indexMap.put(A[i], i);
			}
		}
		if(!isPresent) {
			System.out.println("Indexes are not present");
		}
	}
	
	/*(
	 * Brute Force Method
	 */
	private static void twoSumBruteForceMethod(int[] A, int target) {
		
		int loopCount = 0;
		boolean flag = false;
		
		for(int i=0; i<A.length; i++) {
			for(int j=i+1; j<A.length; j++) {
				if(A[i]+A[j]==target) {
					System.out.println("Success : " + A[i] + " + = " + A[j]);
					flag = true;
					loopCount++;
				}
				loopCount++;
			}
			if(flag) break;
		}
		if(!flag) System.out.println("Pair not found");
		
		System.out.println("LoopCount : " + loopCount);
		
	}
}

