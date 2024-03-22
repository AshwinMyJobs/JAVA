package javacodes.practice;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// BruteForce
	private static int[] twoSum1(int[] A, int target) {
		int[] outputArray = new int[2];

		for (int i = 0; i < A.length - 1; i++) {
			for (int k = i + 1; k < A.length; k++) {
				if (A[i] + A[k] == target) {
					outputArray[0] = i;
					outputArray[1] = k;
					return outputArray;
				}
			}
		}
		return null;
	}

	// Using Hash Map
	private static int[] twoSum2(int[] A, int target) {

		int[] arr = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int j = 0; j < A.length; j++) {
			Integer value = map.get(target - A[j]);
			if (value == null) {
				map.put(A[j], j);
			} else {
				arr[0] = value;
				arr[1] = j;
				break;
			}
		}
		return arr;
	}
}
