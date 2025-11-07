package javacodes.dsa.scaler.career.day.BSearch;

import java.util.Arrays;

/**
 * 
 * @author 5600G Given an sorted and rotated array search for given element if
 *         present or not
 *
 */
public class A3_SearchInSortedAndRotatedArray {

	public static void main(String[] args) {
		int[] A = { 7, 8, 9, 10, 11, 12, 1, 2, 3, 4 };
		//int[] A = { 7, 8, 9, 10, 11, 12 };
		
//		System.out.println(binarySearch(A, 0, A.length-1, 12));

		int minIndex = indexOfSmallestNumber(A);

		System.out.println("Min index is : " + minIndex);
		System.out.println("Min ele is : " + A[indexOfSmallestNumber(A)]);
		
		int foundIndex = -1;
		
		if(minIndex==0) {
			foundIndex = binarySearch(A, 0, A.length-1, 10);
			System.out.println("Element " + 10 + " is present at location " + foundIndex);
		}else {
			foundIndex = binarySearch(A, 0, minIndex, 10);
			if(foundIndex==-1) {
				foundIndex = binarySearch(A, minIndex, A.length-1, 10);
			}
		}
		
		
		
		if(foundIndex!=-1)
			System.out.println("Element present at index : " + foundIndex);
		else
			System.out.println("Element not present"); 

	}

	private static int binarySearch(int[] A, int left, int right, int target) {
		while(left<=right) {
			int mid = (left+right)/2;
			if(A[mid]==target) {
				return mid;
			}else if(A[mid]<target) {
				left = mid + 1;
			}else {
				right = mid -1;
			}
		}
		return -1;
	}
	
	private static int indexOfSmallestNumber(int[] A) {

		int left = 0, right = A.length - 1, mid = 0;

		while (left < right) {
			mid = (left + right) / 2;
			if (A[mid] < A[right]) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}

		return left;
	}
}
