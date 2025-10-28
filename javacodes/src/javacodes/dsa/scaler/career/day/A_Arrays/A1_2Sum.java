package javacodes.dsa.scaler.career.day.A_Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author 5600G
 * Problem statement 
 * Given array of integers and a target value
 * Find first two numbers a and b such that a + b = target 
 */

public class A1_2Sum {

	public static void main(String[] args) {
		int[] inputArray = {1,2,3,4,5,6,7,8,9,10};
		int target = 8;
		
		solution(inputArray, target);
	}

	private static void solution(int[] inputArray, int target) {
		
		boolean isPresent = false;
		int index = 0;
		Map<Integer, Integer> indexMap = new HashMap<>();
		
		for (int num : inputArray) {
			if((indexMap.containsKey(target-num))) {
				isPresent = true;
				System.out.println(inputArray[index] + " : " + inputArray[indexMap.get(target-num)]);
				break;
			}else {
				indexMap.put(num, index);
				index++;
			}
		}
		
		if(!isPresent)
			System.out.println("No pairs found........");
	}
}
