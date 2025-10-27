package javacodes.dsa.scaler.topics.arrays;

public class SmallestNumber {

	public static void main(String[] args) {

		System.out.println(smallestNumber(81000));
		
	}

	private static int smallestNumber(int A) {
		
		String numberString = "";
		
		for(int i=9; i>=2; i--) {
			while(A%i==0) {
				A = A / i;
				numberString = i + numberString;
			}
		}
		
		if(A!=1) return -1;
		
		return Integer.valueOf(numberString);
	}
	
}
