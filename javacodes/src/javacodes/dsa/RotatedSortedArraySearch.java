package javacodes.dsa;

public class RotatedSortedArraySearch {

	public static void main(String[] args) {

		int[] A = {8,9,10,1,2,3,4,5,6,7};
		
		solve(A, 8);
		
	}

	private static int solve(int[] A, int k) {
		
		int l=0, h=A.length-1;
		int l1,h1,l2,h2;
		
		int mid;
		int pivot = 0;
		
		while(l<h) {
			
			mid = (l+h)/2;
			
			if(A[mid]>A[mid+1]) {
				pivot = mid+1;
				break;
			}

			if(A[mid]<A[mid+1])
				h = mid;
			else
				l = mid+1;
		}
		
		if(k>=A[pivot] && k<=A[A.length-1]) {
			l1 = pivot;
			h1 = A.length-1;
		}else {
			l1 = 0;
			h1 = pivot-1;
		}
		
		while(l1<h1) {
			mid = (l1+h1)/2;
			if(A[mid]==k) {
				System.out.println("Key present at index : " + mid);
				return mid;
			}
			if(k>A[mid])
				l1 = mid+1;
			else
				h1 = mid;
		}
		
		System.out.println("Pivot index is : " + pivot);
		
		return -1;
	}
}
