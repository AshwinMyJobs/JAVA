package javacodes.dsa.hashing;

import java.util.HashSet;

public class FirstRepeatingElement {

	public static void main(String[] args) {

		
	}
	
    public int solve(int[] A) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0; i<A.length; i++) {
        	if(!hashSet.add(A[i]))
        		return i;
        }
    	return 0;
    }
}
