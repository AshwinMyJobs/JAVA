package javacodes.dsa.scaler.career.day.A_Arrays;

/**
 * 
 * @author 5600G
 * Given an target integer, find a smallest number such that the
 * product of the integer in smallest number is equal to target integer. 
 * 
 */
public class A3_SmallestNumber {

	public static void main(String[] args) {
		solution(1000);
	}

	private static void solution(int A) {
		
		String smallestInteger = "";
		
		for(int i=9; i>=2; i--) {
			while(A%i==0) {
				A = A / i;
				smallestInteger = i + smallestInteger;
			}
		}
		
		if(A!=1) 
			System.out.println("No smallest number found");
		else
			System.out.println(Integer.parseInt(smallestInteger));
		
	}
}
