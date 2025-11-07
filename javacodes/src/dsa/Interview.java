package dsa;

import java.util.Arrays;

public class Interview {

	public static void main(String[] args) {

		//int[] nums = {5,6,7,8,0,1,2};
		
		int[] nums = {4, 5, 6, 7, 0, 1, 2};
		
		int[][] testCases = {
			    {3, 4, 5, 1, 2},                    // expected min index = 3 (value = 1)
			    {4, 5, 6, 7, 0, 1, 2},              // expected min index = 4 (value = 0)
			    {2, 3, 4, 5, 6, 7, 1},              // expected min index = 6 (value = 1)
			    {5, 1, 2, 3, 4},                    // expected min index = 1 (value = 1)
			    {1, 2, 3, 4, 5},                    // expected min index = 0 (value = 1)
			    {2, 1},                             // expected min index = 1 (value = 1)
			    {0, 1},                             // expected min index = 0 (value = 0)
			    {3, 2, 1},                          // expected min index = 2 (value = 1)
			    {6, 7, 8, 9, 10, 1, 2, 3, 4, 5},    // expected min index = 5 (value = 1)
			    {9, 10, 1, 2, 3, 4, 5, 6, 7, 8},    // expected min index = 2 (value = 1)
			    {2, 3, 4, 5, 6, 7, 8, 9, 1},        // expected min index = 8 (value = 1)
			    {1, 2, 3, 4, 5, 6, 7, 8, 9}         // expected min index = 0 (value = 1)
			};
		
		
		
		int target = 7;
		
//		for (int[] is : testCases) {
//			System.out.println(Arrays.toString(is));
//			int minIndex = findMinIndex(nums);
//			System.out.println("Min index is : " + minIndex);
//		}
		
        int minIndex = findMinIndex(nums);

        int targetIndex = binarySearch(nums, 0, minIndex, target);

        if(targetIndex==-1)
            targetIndex = binarySearch(nums, minIndex, nums.length - 1, target);

        System.out.println(targetIndex);
	}

	
    private static int binarySearch(int[] A, int left, int right, int target){

        int index = -1;

        while(left<=right){
            int mid = (left+right)/2;
            if(A[mid]==target){
                return mid;
            }else if(A[mid]<target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return index;
    }


    private static int findMinIndex(int[] A){
        int left=0, right=A.length-1, mid=0;

        while(left<right){
            mid = (left+right)/2;
            if(A[mid]>A[right]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return left;
    }
}
