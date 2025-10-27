package javacodes.dsa.scaler.topics.binarysearch;

public class MinElementInSortedAndRotatedArray {

	public static void main(String[] args) {

		
		int[] A = {9,10,1,2,3,4,5,6,7,8};
		
		System.out.println(minElement(A));
		
		
	}

	private static int minElement(int[] A) {
		
		int left=0,right=A.length-1;
		int mid = -1;
		
		while(left<right) {
			
			mid = (left+right)/2;
			
			if(A[mid]<A[right]) {
				right = mid;
			}else {
				left = mid + 1;
			}			
		}
		return A[left];
	}
}
