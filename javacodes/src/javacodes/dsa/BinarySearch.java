package javacodes.dsa;

public class BinarySearch {

	public static void main(String[] args) {
		int[] A = {1,2,3,4,5,6,7,8,9,10};
		int key = 20;
		
		boolean keyPresent = binarySearch(A, key);
		
		System.out.println(keyPresent);
	}

	private static boolean binarySearch(int[] A, int key) {
		
		int high = A.length-1;
		int low = 0;
		int mid =0;
		
		while(high>low) {
			mid = (high+low)/2;
			
			if(A[mid]==key) return true;
			
			if(key<A[mid]) {
				high = mid;
			}
			else {
				low= mid + 1;
			}
		}
		
		return false;
	}
}
