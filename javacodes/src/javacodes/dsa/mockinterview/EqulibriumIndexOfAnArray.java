package javacodes.dsa.mockinterview;

public class EqulibriumIndexOfAnArray {

	public static void main(String[] args) {
		int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
		System.out.println(equlibriumIndex(arr));
	}

	private static int equlibriumIndex(int[] A) {
		
		int[] preFixSumArray = new int[A.length];
		int[] suFFixSumArray = new int[A.length];
		
		preFixSumArray[0] = A[0];
		for(int i=1; i<A.length; i++) {
			preFixSumArray[i] = preFixSumArray[i-1] + A[i];
		}
		
		suFFixSumArray[A.length-1] = A[A.length-1];
		for(int i=A.length-2; i>=0; i--) {
			suFFixSumArray[i] = suFFixSumArray[i+1] + A[i];
		}
		
		for(int i=0; i<A.length; i++) {
			if(preFixSumArray[i]==suFFixSumArray[i])
				return i+1;
		}
		return -1;
	}
}
