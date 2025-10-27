package javacodes.dsa.sorting;

import java.util.Arrays;
import java.util.stream.Stream;

public class BubbleSort {

	public static void main(String[] args) {
		int[] inputArray = {5, 4, 3, 2, 1};
		bubbleSort(inputArray);
	}

	private  static void bubbleSort(int[] A) {
		
		System.out.println("Input  array before sorting ");
		Arrays.stream(A).forEach(e->System.out.println(e));
		
		for(int i=0; i<A.length-1; i++) {
			for(int j=0; j<= A.length-i-2; j++) {
				int temp = 0;
				if(A[j]>A[j+1]) {
					temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}
			}
		}
		System.out.println("Input  array after sorting ");
		Arrays.stream(A).forEach(e->System.out.println(e));
	}
}
