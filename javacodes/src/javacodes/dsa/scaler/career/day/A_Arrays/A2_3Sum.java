package javacodes.dsa.scaler.career.day.A_Arrays;

import java.util.Arrays;

/**
 * 
 * @author 5600G Given integer array and target find all the tirplets such that
 *         i + j + k = target Note : Solution must contain unique triplets
 */
public class A2_3Sum {

	public static void main(String[] args) {
		int[] inputArray = { 7, -6, 3, 8, -1, 8, -11 };
		solution(inputArray, 0, inputArray.length);
	}

	// Need to practice this one
	private static void solution(int[] A, int target, int length) {
		Arrays.sort(A);
		for (int i = 0; i < length; i++) {
			if (i == 0 || (A[i] != A[i - 1])) {
				int j = i + 1, k = length - 1;
				int tar = target - A[i];
				while (j < k) {
					if (A[j] + A[k] == tar) {
						System.out.println(A[i] + " " + A[j] + " " + A[k]);
						// Ignoring duplicates
						while (j < k && A[j] == A[j + 1])
							j++;
						while (j < k && A[k] == A[k - 1])
							k--;

						j++;
						k--;
					} else if (A[j] + A[k] < tar) {
						j++;
					} else if (A[j] + A[k] > tar) {
						k--;
					}
				}
			}
		}
	}

	// Practice 1
	private static void solutionP1(int[] A, int target, int length) {
		Arrays.sort(A);

		for (int i = 0; i < length; i++) {
			if (i == 0 || A[i] != A[i - 1]) {
				int j = i + 1, k = length - 1;
				int tar = target - A[i];
				while (j < k) {
					if (A[j] + A[j] == tar) {
						System.out.println(A[i] + " " + A[j] + " " + A[k]);
						// Ignore duplicates
						while (j < k && A[j] == A[j + 1])
							j++;
						while (j < k && A[k] == A[k - 1])
							k--;
						j++;
						k--;
					}else if(A[j]+A[k] < tar) {
						j++;
					}else {
						k--;
					}
				}
			}
		}
	}
	
	// Practice 2
	private static void solutionP2(int[] A, int target, int length) {
		Arrays.sort(A);
		for(int i=0; i<length; i++) {
			if(i==0 || A[i]!=A[i-1]) {
				int j = i + 1, k = length - 1;
				int tar = target - A[i];
				while(j<k) {
					if(A[j]+A[k]==tar)
						System.out.println(A[i] + " " + A[j] + " " + A[k]);
					//Ignoring duplictes
					while(j<k && A[j]==A[j+1]) j++;
					while(j<k && A[k]==A[k-1]) k--;
					j++;
					k--;
				}
			}
		}
	}
}









