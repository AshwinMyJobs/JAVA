package javacodes.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		
		int[] inputArray = {1, 1, 0, -1, -2};
		
		List<List<Integer>> outputList = threeSum(inputArray);
		
		System.out.println(outputList);
		
	}

	private static List<List<Integer>> threeSum(int[] A) {

	List<List<Integer>> outputList = new ArrayList<>();
	List<Integer> tempList = new ArrayList<>();
	Arrays.sort(A);
	//[-2,-1,0,1,1]
	int l,r;
	int count = 0;
	for(int i=0; i<A.length-2; i++) {
		l = i+1;
		r = A.length-1;
		
		while(l<r) {
			if(A[i]+A[l]+A[r]==0) {
				count++;
				tempList.add(count);
				outputList.add(tempList);
				tempList = new ArrayList<>();
				tempList.add(A[i]);
				tempList.add(A[l]);
				tempList.add(A[r]);
				outputList.add(tempList);
				tempList = new ArrayList<>();
				break;
			}else if (A[i] + A[l] + A[r] < 0) {
				l++;
			}else {
				r--;
			}
		}
	}
	
	
	return outputList;
	}
}
