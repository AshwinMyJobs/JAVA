package javacodes.dsa.arrays2d;

public class SearchInSorted2DArray {

	public static boolean solve(int[][] sortedArray, int element) {
		
		int i=0, j=sortedArray[0].length-1;
		
		while(i<sortedArray[0].length && j>=0) {
			if(sortedArray[i][j]==element) {
				return true;
			}else {
				if(sortedArray[i][j]<element) {
					j--;
				}else {
					i++;
				}
			}
		}
		return false;
	}
}