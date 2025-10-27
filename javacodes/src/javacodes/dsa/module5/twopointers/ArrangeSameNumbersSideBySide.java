package javacodes.dsa.module5.twopointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArrangeSameNumbersSideBySide {

	public static void main(String[] args) {
		// int[] inputArray = { 0, 1, 2, 2, 0, 1, 1, 2, 0 };
		// int[] inputArray = { 0, 0, 1, 0, 1, 0, 0, 1, 0 };
		int[] inputArray = { 1, 8, 100, 30, 5, 50, 20, 55};
		// int[] inputArray = {1,8,-1,3,-5,5,-8};

		System.out.println(solveScalerSolution(inputArray));
	}

	// This method is not working for all test case need to revisit
	private static int[] solve(int[] A) {

		int lp = 0;
		int rp = A.length - 1;

		// Move index such that lp is pointing to first 0 and rp is pointing to first
		// non zero

		do {
			if (A[lp] == 0)
				lp++;
			else
				break;
		} while (A[lp] == 0);

		while (lp < rp) {
			if (A[lp] == 0) {
				lp++;
			} else {
				while (lp < rp) {
					if (A[rp] == 0) {
						int temp = A[lp];
						A[lp] = A[rp];
						A[rp] = temp;
						lp++;
						rp--;
					} else {
						rp--;
					}
				}

			}
		}

		rp = A.length - 1;

		if (lp < rp) {
			if (A[lp] == 0)
				lp++;
		}

		while (lp < rp) {
			if (A[lp] == 1) {
				lp++;
			} else {
				while (lp < rp) {
					if (A[rp] == 1) {
						int temp = A[lp];
						A[lp] = A[rp];
						A[rp] = temp;
						lp++;
						rp--;
					}
					{
						rp--;
					}
				}

			}
		}
		return A;
	}

	// Same solution with count method\
	// This works for fixed given elements like 0 and 1
	// If one more type of element is put then it will fail and to fix it we add one
	// more for loop
	private static int[] solveWithCountHsahMap(int[] A) {

		HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();

		for (int x : A) {
			if (countMap.containsKey(x)) {
				int count = countMap.get(x);
				count++;
				countMap.put(x, count);
			} else {
				countMap.put(x, 1);
			}
		}

		System.out.println(countMap.size());

		int insertDigit = 0;

		int index = 0;

		for (int i = index; i < countMap.get(0); i++) {
			A[i] = 0;
			index++;
		}

		for (int i = index; i < (countMap.get(0) + countMap.get(1)); i++) {
			A[i] = 1;
			index++;
		}

//		for (int i = index; i < (countMap.get(0)+countMap.get(1) +countMap.get(2)); i++) {
//			A[i] = 2;
//		}
		return A;
	}

	// This solves the issue with generic numbers
	private static int[] solveWithCountHsahMapGeneral(int[] A) {

		HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();

		for (int x : A) {
			if (countMap.containsKey(x)) {
				int count = countMap.get(x);
				count++;
				countMap.put(x, count);
			} else {
				countMap.put(x, 1);
			}
		}

		System.out.println(countMap.size());

		int index = 0;

		Set<Entry<Integer, Integer>> entrySet = countMap.entrySet();

		for (Iterator iterator = entrySet.iterator(); iterator.hasNext();) {
			Entry<Integer, Integer> entry = (Entry<Integer, Integer>) iterator.next();
			int key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key + " : " + value);

			for (int i = 0; i < value; i++) {
				A[index] = key;
				index++;
			}
		}

		return A;
	}

	// Count sort form Scaler solution
	// This is generic and will work for all non negative inputs
	private static int[] solveScalerSolution(int[] A) {

		int n = A.length;
		int mx = -1;
		for (int i = 0; i < n; i++) {
			mx = Math.max(mx, A[i]);
		}
		int[] freq = new int[mx + 1];
		for (int i = 0; i < n; i++) {
			freq[A[i]] += 1;
		}
		int k = 0;
		for (int i = 0; i <= mx; i++) {
			for (int j = 0; j < freq[i]; j++) {
				A[k] = i;
				k++;
			}
		}
		return A;
	}

	private static void solveMinimumAbsoluteDifference(int[] A) {

		Arrays.sort(A);
		
		int minDist = Integer.MAX_VALUE;
		for(int i=0; i<A.length-1; i++) {
			if(minDist > Math.abs(A[i]-A[i+1])) {
				minDist = Math.abs(A[i]-A[i+1]);
			}
		}

		System.out.println("Min dist is : " + minDist);
	}
}
