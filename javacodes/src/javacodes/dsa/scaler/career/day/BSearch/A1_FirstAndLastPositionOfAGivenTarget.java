package javacodes.dsa.scaler.career.day.BSearch;

import java.util.Arrays;

/**
 * 
 * @author 5600G
 * For a given sorted integer array find first and last position of a target number
 */
public class A1_FirstAndLastPositionOfAGivenTarget {

	public static void main(String[] args) {

		int A[] = {1,2,3,3,3,3,3,3,3,4,5,6,7,8};
		solution(A, 4);
	}

	private static void solution(int[] A, int target) {
		int left = 0, right = A.length-1, first=-1, mid;
		
		while(left<=right) {
			mid = (left+right)/2;
			if(A[mid]==target) {
				first = mid;
				right = mid -1;
			}else if(A[mid]<target){
				left = mid + 1;
			}else {
				right = mid -1;
			}
		}
		
		left = 0;
		right =A.length-1;
		int last = -1;
		
		while(left<=right) {
			mid = (left+right)/2;
			if(A[mid]==target) {
				last = mid;
				left = mid + 1;
			}else if(A[mid]<target) {
				left = mid + 1;
			}else {
				right = right -1;
			}
		}
		
		System.out.println(Arrays.toString(A) + " : " + target);
		System.out.println(first + " " + last);
	}
	
	//Practice
	private static void solution1(int[] A, int target) {
		int left = 0, right = A.length-1, mid =0, first = 0, last=0;
		
		while(left<right) {
			mid = (left+right)/2;
			if(A[mid]==target) {
				first = mid;
				right = mid - 1;
			}else if(A[mid]<target) {
				left = mid + 1;
			}else if(A[mid]>target) {
				right = mid -1;
			}
		}
		
		left = 0;
		right = A.length - 1;
		
		while(left<right) {
			mid = (left+right)/2;
			if(A[mid]==target) {
				last = mid;
				left = mid + 1;
			}else if(A[mid]<target) {
				left = mid + 1;
			}else if(A[mid]>target) {
				right = mid -1;
			}
		}
	}
	
	//Practice
	private static void soluton2(int[] A, int target) {
		int left=0, right=A.length-1,first=0,last=0,mid=0;
		
		while(left<right) {
			mid = (left+right)/2;
			if(A[mid]==target) {
				first = mid;
				right = mid - 1;
			}else if(A[mid]<target) {
				left++;
			}else if(A[mid]>target) {
				right--;
			}
		}
		
		left = 0;
		right = A.length - 1;
		
		while(left<right) {
			mid = (left+right)/2;
			if(A[mid]==target) {
				right = mid;
				left = mid + 1;
			}else if(A[mid]<target) {
				left++;
			}else if(A[mid]>target){
				right--;
			}
		}
	}
}



























































