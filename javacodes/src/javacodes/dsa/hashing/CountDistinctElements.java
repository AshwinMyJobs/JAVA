package javacodes.dsa.hashing;

import java.util.HashSet;

public class CountDistinctElements {

	public static void main(String[] args) {

		
	}

	
    public int solve(int[] A) {
        HashSet<Integer> hashSet = new HashSet<>();
        
        for(int i=0; i<A.length; i++) {
        	hashSet.add(A[i]);
        }
    	return hashSet.size();
    }
}
