package javacodes.dsa.mockinterview;

public class MaxSumOfContigiousSubArray {

	public static void main(String[] args) {
		
		int[] intput = {1, -2, 3, 4, -10};
		
		System.out.println(maxSum(intput));

	}
	
	private static int maxSum(int[] A) {
		
		int sum_max = Integer.MIN_VALUE;
		int sum_sofar = 0;
		
		for(int i=0; i<A.length; i++) {
			sum_sofar = sum_sofar + A[i];
			if(sum_max<sum_sofar) sum_max = sum_sofar;
			if(sum_sofar<0) sum_sofar = 0;
		}
		return sum_max;
	}
}