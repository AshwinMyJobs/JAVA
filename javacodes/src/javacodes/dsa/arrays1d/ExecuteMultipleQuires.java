package javacodes.dsa.arrays1d;

import java.util.Arrays;

public class ExecuteMultipleQuires {
	
	
	public static void main(String[] args) {
		
		int[] start = {1,2,5};
		int[] end = {3,5,6};
		int[] val = {2,3,-1};
		
		solve(10, start, end, val);
	}

	//Brute Force O(N)=O(Q*N)
	public static void solve(int N, int start[], int end[], int val[]) {
		
		int A[] = new int[N];
		int Q = end.length;
		
		for(int z=0; z<Q; z++) {
			int i = start[z];
			int j = end[z];
			int v = val[z];
			
			while(i<=j) {
				A[i] = A[i] + v;
				i++;
			}
		}
		
		Arrays.stream(A).forEach(System.out::print);
	}
}
