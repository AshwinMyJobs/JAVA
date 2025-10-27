package javacodes.dsa.scaler.topics.binarysearch;

public class FirstLastIndex {

	public static void main(String[] args) {
		
		int[] A = {1,2,3,4,5,6,6,7,8,6};
		firstLastIndex(A, 6);
		

	}
	
	public static void firstLastIndex(int[] A, int target) {
		
		int left = 0, right = A.length-1;
		int first = -1;
		
		//To find first index
		while(left<=right) {
			int mid = (left+right)/2;
			
			if(A[mid]==target) {
				first = mid;
				right = mid - 1;
			}else if(A[mid]<target) {
				left = mid+1;
			}else if(A[mid]>target) {
				right = mid-1;
			}
		}
		
		//To find last index
		left = 0;
		right = A.length-1;
		int last = -1;
		while(left<=right) {
			int mid = (left+right)/2;
			
			if(A[mid]==target) {
				last = mid;
				left = mid + 1;
			}else if(A[mid]<target) {
				left = mid+1;
			}else if(A[mid]>target) {
				right = mid-1;
			}
		}
		
		System.out.println("First index : " + first + " Last index is : " + last);
	}
}
