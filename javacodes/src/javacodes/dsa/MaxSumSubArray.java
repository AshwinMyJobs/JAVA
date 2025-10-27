package javacodes.dsa;

public class MaxSumSubArray {

	public static void main(String[] args) {
		
		int[] input = {1,2,3};
		
		System.out.println("Max sum of subarray is : " + solve(input));
		
		System.out.println("Max sum of subarray is : " + maxSubarraySum(input));
		
	}
	
	private static int solve(int[] A) {
		
		int cur_max = A[0];
		int maxSubArray = A[0];
		
		for(int i=1; i<A.length; i++) {
			
			cur_max = cur_max + A[i];
			
			if(maxSubArray<cur_max) maxSubArray = cur_max;
			
			if(cur_max<0) cur_max = 0;
		}
		
		return maxSubArray;
	}
	
	//From geeks for geeks
    static int maxSubarraySum(int[] arr) {
        int res = arr[0];
        int maxEnding = arr[0];

        for (int i = 1; i < arr.length; i++) {
            
            // Find the maximum sum ending at index i by either extending 
            // the maximum sum subarray ending at index i - 1 or by
            // starting a new subarray from index i
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
          
            // Update res if maximum subarray sum ending at index i > res
            res = Math.max(res, maxEnding);
        }
        return res;
    }
}
