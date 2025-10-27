package javacodes.dsa.module4.timecomplexity;

public class SecondLargest {

	public static void main(String[] args) {
//		int[] intArray = { 10, 10, 9, 8, 1 };
//		System.out.println(solve2(intArray));
//
//		int[] arr = { 10, 20, 30, 40, 50 };
//		fun(arr);
//		System.out.println(arr[3]);
		
		int digit = 1234;
		int div = 1234 / 10;
		int rem =1234 % 10;
		System.out.println(div);
		System.out.println(rem);
		
		System.out.println(sum(123456));
		
		printNumbers(10);
		System.out.print("Hello from main");

	}

	// Find SecondMax
	public static int solve1(int[] A) {

		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int diff = Integer.MAX_VALUE;

		int firstMaxIndex = 0;

		if (A.length == 0 || A.length == 1)
			return -1;

		for (int i = 0; i < A.length; i++) {
			if (A[i] > firstMax) {
				firstMax = A[i];
				firstMaxIndex = i;
			}
		}

		for (int i = 0; i < A.length; i++) {
			if (i != firstMaxIndex) {
				if (firstMax != A[i]) {
					if (firstMax - A[i] < diff) {
						diff = firstMax - A[i];
						secondMax = A[i];
					}
				}
			}
		}

		if (firstMax == secondMax || secondMax == Integer.MIN_VALUE)
			return -1;

		return secondMax;
	}

	// Find MinimumTime to equality
	public static int solve2(int[] A) {

		int firstMax = Integer.MIN_VALUE;
		int minMinutes = 0;

		int firstMaxIndex = 0;

		if (A.length == 0 || A.length == 1)
			return -1;

		for (int i = 0; i < A.length; i++) {
			if (A[i] > firstMax) {
				firstMax = A[i];
				firstMaxIndex = i;
			}
		}

		for (int i = 0; i < A.length; i++) {
			if (i != firstMaxIndex) {
				if (firstMax != A[i]) {
					minMinutes += firstMax - A[i];
				}
			}
		}

		return minMinutes;
	}

	// Change array element and see
	static void fun(int[] arr) {
		arr[3] = 98;
		return;
	}

	/**
	 * Given an array A of N integers. Count the number of elements that have at
	 * least 1 elements greater than itself.
	 */
	public static int solve3(int[] A) {

		int firstMax = Integer.MIN_VALUE;
		int firstMaxIndex = 0;
		int count = 0;


		if (A.length == 0 || A.length == 1)
			return -1;

		for (int i = 0; i < A.length; i++) {
			if (A[i] > firstMax) {
				firstMax = A[i];
				firstMaxIndex = i;
			}
		}

		for (int i = 0; i < A.length; i++) {
			if (i != firstMaxIndex) {
				if (firstMax > A[i]) {
					count++;
				}
			}
		}

		return count;
	}
	
	//Prefix sum array
	public static int[] solve4(int[] A) {

        int[] preFixSumArray = new int[A.length];
        
        int sum = 0;
        
        for(int i=0; i<A.length; i++) {
        	sum+=A[i];
        	preFixSumArray[i] = sum;
        }
        
        return preFixSumArray;
    }
	
	static int sum(int digit) {
		
		if(digit <10 ) return digit;
		
		return (digit % 10) + sum(digit/10);
	}
	
	static void printNumbers(int A) {
		
		if(A==1)
			System.out.println(A);
		else {
			System.out.print(A + " ");
			printNumbers(A-1);
		}
	}
	
}





















