package javacodes.dsa.module4.timecomplexity;

import java.util.HashMap;
import java.util.Map;

public class PrefixSumArray {

	public static void main(String[] args) {
		int[] inputArray = {1,2,3,4};

		prefixSumArray(inputArray);
		
		System.out.println(solve(inputArray));
	}

	private static void prefixSumArray(int[] A) {
		
		int[] preFixSumArray = new int[A.length];
		int sum = A[0];
		preFixSumArray[0] = A[0];
		for(int i=1; i<A.length; i++) {
			sum = sum + A[i];
			preFixSumArray[i] = sum;
		}
		
		System.out.println();
	}
	
	
	public static int solve(int[] A) {
        HashMap<Integer,Integer> hashMap = new HashMap();
        
        for(int x: A){
            if(hashMap.containsKey(x)){
                int count = hashMap.get(x);
                count++;
                hashMap.put(x, count);
            }else {
            	hashMap.put(x, 1);
            }
        }
        
        int uniqueCount = 0;
        for(Map.Entry<Integer, Integer> entryMap: hashMap.entrySet()) {
        	if(hashMap.get(entryMap.getKey())==1) {
        		uniqueCount++;
        	}
        }
        
        return uniqueCount;
    }
}
