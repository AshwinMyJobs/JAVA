package javacodes.dsa.scaler.career.day.A_Arrays;

import java.util.Iterator;

/**
 * 
 * @author 5600G
 * A majority element in an given integer array is that element which number of occurance is 
 * more that the size of the array. 
 *
 */
public class A4_MajorityElement {

	public static void main(String[] args) {
		//int[] A = {1,2,3,4,5,5,5,5,5,5,5};
		int[] A = {1,2,3,4,5};
		solution(A);
	}

	private static void solution(int[] A) {
		int possibleCandidate = A[0];
		int count = 0;
		
		for (int i : A) {
			if(i==possibleCandidate) {
				count++;
			}else {
				count--;
				if(count==0)
					possibleCandidate = A[i];
			}
		}
		
		count = 0;
		for (int i : A) {
			if(i==possibleCandidate)
				count++;
		}
		
		if(count>A.length/2)
			System.out.println("Majority element is : " + possibleCandidate);
		else
			System.out.println("Majority element is not present");
	}
}
