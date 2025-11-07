package javacodes.dsa.scaler.career.day.BSearch;

import java.util.Arrays;

/**
 * 
 * @author 5600G Given sorted rotated array find minimum element in that array
 */
public class A2_FindMinElementInSortedRotatedArray {

	public static void main(String[] args) {
		int[] A = { 7, 8, 9, 10, 11, 12, 1, 2, 3, 4 };
		//int[] A = {  11, 12, 1, 2, 3, 4 };
		solution(A);
	}

	private static void solution(int A[]) {
		int left = 0, right = A.length - 1, mid;

		while (left < right) {
			{
				mid = (left + right) / 2;
				if (A[mid] < A[right]) {
					right = mid;
				} else {
					left = mid + 1;
				}
			}
		}
		System.out.println(Arrays.toString(A));
		System.out.println("Min element is : " + A[left]);
	}

	// Practice
	private static void solution1(int[] A) {
		int left = 0, right = A.length - 1, mid = 0;

		while (left < right) {
			mid = (left + right) / 2;
			if (A[mid] < A[right]) {
				right = mid;
			} else if (A[mid] > A[right]) {
				left = mid + 1;
			}
		}
		System.out.println(Arrays.toString(A));
		System.out.println("Min element is : " + A[left]);
	}
	
	//Solution
	private static void solution2(int[] A) {
		int left = 0, right = A.length - 1, mid = 0;
		while(left<right) {
			mid = (left+right)/2;
			if(A[mid]<A[right]) {
				right = mid;
			}else if(A[mid]>A[right]) {
				left = mid + 1;
			}
		}
	}
}

















