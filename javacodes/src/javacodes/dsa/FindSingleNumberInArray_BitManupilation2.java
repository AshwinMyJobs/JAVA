package javacodes.dsa;

import java.util.Iterator;

public class FindSingleNumberInArray_BitManupilation2 {

	public static void main(String[] args) {
		//int[] inputArray = {1,2,3,4,1,2,3,1,2,3};
		int[] inputArray = {4,4,4,0};
		System.out.println(singleNumber(inputArray));

	}

	private static int singleNumber(final int[] A) {
		final int INT_SIZE = 32;
        int result = 0;
        for(int bitIterator = 0; bitIterator < INT_SIZE; bitIterator++) {
            int sum = 0, mask = (1 << bitIterator);
            for(int arrIterator = 0; arrIterator < A.length; arrIterator++) {
                if((A[arrIterator] & mask) != 0) {
                    sum++;
                }
            }
            if(sum % 3 == 1) {
                result |= mask;
            }
        }
        return result;
    }
}
