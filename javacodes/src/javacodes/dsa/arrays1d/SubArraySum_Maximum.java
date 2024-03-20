package javacodes.dsa.arrays1d;

public class SubArraySum_Maximum {

	public static int solve(int[] A) {
		
		int currentSum = 0;
		int maxSubArraySum = Integer.MIN_VALUE;
		
		for(int i=0; i<A.length; i++) {
			
			currentSum = currentSum + A[i];
			
			if(currentSum>maxSubArraySum)
				maxSubArraySum = currentSum;
			
			if(currentSum<0)
				currentSum = 0;
		}
		
		return maxSubArraySum;
	}
}
