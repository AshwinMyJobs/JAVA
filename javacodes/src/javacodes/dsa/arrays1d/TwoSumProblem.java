package javacodes.dsa.arrays1d;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
	
	public static void main(String[] args) {
		int[] inputArray = {1,2,3,4,5,7,9,10};
		int key =16;
		
		inputArray = solve(inputArray, key);
		
		System.out.println(Arrays.toString(inputArray));
	}
	
	
	public static int[] solve(int[] inputArray, int key) {
		
		Map<Integer, Integer> hashMap = new HashMap<>();
		
		int[] outPutArray = new int[2];
		
		for(int i=0; i<inputArray.length; i++) {
			
			int diff = key - inputArray[i];
			
			if(hashMap.containsKey(diff)) {
				outPutArray[0] = inputArray[i];
				outPutArray[1] = diff;
				break;
			}else {
				hashMap.put(inputArray[i], i);
			}
		}
		return outPutArray;
	}
}
