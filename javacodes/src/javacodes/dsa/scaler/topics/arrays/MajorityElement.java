package javacodes.dsa.scaler.topics.arrays;

public class MajorityElement {

	public static void main(String[] args) {
		//int[] A = {1,2,3,4,5,6,7,8,9,10};
		int[] A = {1,1,1,1,5,6,1,8,1,10};
		System.out.println(majorityElement(A));
	}

	private static int majorityElement(int[] A) {
		
		int majElement = A[0];
		int count = 1;
		
		for(int i=1; i<A.length; i++) {
			if(A[i]==majElement) {
				count++;
			}else {
				count--;
				if(count==0)
					majElement = A[i];
			}
		}
		
		int halfWayCount = A.length/2;
		
		int tempCount = 0;
		
		for(int i=0; i<A.length; i++) {
			if(A[i]==majElement) tempCount++;
		}
		
		if(tempCount>halfWayCount) return majElement;
		
		return -1;
	}
}
