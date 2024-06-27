package javacodes.dsa.arrays1d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SubArrayWithSumZero {

	public static void main(String[] args) {
		Integer[] A = {4,2,-3,1,3};
//		Integer[] A = {1,2,3,4,5};
		List<Integer> inputList = Arrays.asList(A);
		System.out.println(solve(inputList));
	}

	public static int solve(List<Integer> A) {
	      HashSet < Long > set = new HashSet < Long > ();
	        long sum = 0;
	        set.add(sum);
	        for (int x: A) {
	            sum += x;
	            if (set.contains(sum)) return 1;
	            else {
	                set.add(sum);
	            }
	        }
	        return 0;
	  }
}
