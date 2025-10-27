package javacodes.dsa.mockinterview;

public class SumOfAllSubArrays {

	public static void main(String[] args) {
		int A[] = {1,2,3,4,5};
		System.out.println(sumOfAllSubArrays(A));
	}

	public static int sumOfAllSubArrays(int[] A) {
		int sum = 0;
		
		for(int i=0; i<A.length; i++) {
			sum = sum + (A[i]*(i+1)*(A.length-i));
		}
		return sum;
	}
}