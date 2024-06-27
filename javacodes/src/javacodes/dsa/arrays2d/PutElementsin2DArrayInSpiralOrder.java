package javacodes.dsa.arrays2d;

import java.util.Arrays;

public class PutElementsin2DArrayInSpiralOrder {

	
	
	public static void solve(int N) {
		
		int[][] inputArray = new int[N][N];
		
		int rLength = inputArray.length;
		int cLength = inputArray[0].length;
		
		int rStart = 0;
		int cStart = 0;
		
		int rMin = 0;
		int cMin = 0;
		
		int count = 0;
		int index = 1;
		int inputElement = 1;
		
		while(count < rLength * cLength) {
			
			while(cMin<cLength-index) {
				inputArray[rMin][cMin] = inputElement;
				inputElement++;
				count++;
				cMin++;
			}
			while(rMin<rLength-index) {
				inputArray[rMin][cMin] = inputElement;
				inputElement++;
				count++;
				rMin++;
			}
			while(cMin>cStart) {
				inputArray[rMin][cMin] = inputElement;
				inputElement++;
				count++;
				cMin--;
			}
			while(rMin>rStart) {
				inputArray[rMin][cMin] = inputElement;
				inputElement++;
				count++;
				rMin--;
			}
			
			rStart++;
			cStart++;
			
			rMin = rStart;
			cMin = cStart;
			
			index++;
			
			
			if(  ((rLength*cLength)-count ==1) ) {
				inputArray[rMin][cMin] = inputElement;
				break;
			}
			
		}
		System.out.println(Arrays.deepToString(inputArray));
	}
}
