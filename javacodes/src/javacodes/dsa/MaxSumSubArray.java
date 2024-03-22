package javacodes.dsa;

public class MaxSumSubArray {

	public static void main(String[] args) {
		
	}
	
	private static int solve(int[] A) {
		
		int cur_max = 0;
		int maxSubArray = Integer.MIN_VALUE;
		
		for(int i=0; i<A.length; i++) {
			
			cur_max = cur_max + 1;
			
			if(maxSubArray<cur_max) maxSubArray = cur_max;
			
			if(cur_max<0) cur_max = 0;
		}
		
		return cur_max;
	}
}
