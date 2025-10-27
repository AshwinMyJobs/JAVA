package javacodes.dsa.mockinterview;

public class SubArrayWithGivenSumAndLength {

	public static void main(String[] args) {
		int[] z = {0,1,2,3,4,5,6,7,8};
		int[] A = {1,2,3,4,5,6,7,8,9};
		System.out.println(method(A, 22, 4));
	}

	public static boolean method(int[] A, int sum, int length) {
		int tempSum = 0;
		int count = 0;
		boolean isFirstTime = true;
		
		if(A.length<length) return false;
		
		for(int i=0; i<=A.length-length; i++) {
			if(isFirstTime) {
				for(int j=0; j<length; j++) {
					tempSum = tempSum + A[j];
					isFirstTime = false;
				}
				if(tempSum==sum) return true;
			}else {
				tempSum = tempSum-A[i-1]+A[i+(length-1)];
				if(tempSum==sum) return true;
			}
		}
		return false;
	}
}
