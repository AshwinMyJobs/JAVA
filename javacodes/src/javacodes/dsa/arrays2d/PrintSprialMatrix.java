package javacodes.dsa.arrays2d;

public class PrintSprialMatrix {
	
	public static void solve(int[][] inputArray) {

		int i = 0, j = 0;

		int length = inputArray.length;

		while (length > 0) {
			for (int k = 1; k < length; k++) {
				System.out.print(inputArray[i][j] + ",");
				j++;
			}
			for (int k = 1; k < length; k++) {
				System.out.print(inputArray[i][j] + ",");
				i++;
			}
			for (int k = 1; k < length; k++) {
				System.out.print(inputArray[i][j] + ",");
				j--;
			}
			for (int k = 1; k < length; k++) {
				System.out.print(inputArray[i][j] + ",");
				i--;
			}

			i++;
			j++;
			length = length - 2;
		}

		if (inputArray.length % 2 != 0) {
			System.out.print(inputArray[--i][--j]);
		}
	}

	
	
	public static void solve2(int[][] inputArray) {
		
		int rLength = inputArray.length;
		int cLemgth = inputArray[0].length;
		
		int rStart = 0 ,cStart = 0;
		int rMin = 0, cMin = 0;
		
		int count = 0;
		int index = 1;
		
		while(count < inputArray.length * inputArray[0].length) {
			
			while(cMin<cLemgth-index) {
				System.out.print(inputArray[rMin][cMin]+",");
				cMin++;
				count++;
			}
			
			while(rMin<rLength-index) {
				System.out.print(inputArray[rMin][cMin]+",");
				rMin++;
				count++;
			}
			
			while(cMin>cStart) {
				System.out.print(inputArray[rMin][cMin]+",");
				cMin--;
				count++;
			}
			
			
			while(rMin>rStart) {
				System.out.print(inputArray[rMin][cMin]+",");
				rMin--;
				count++;
			}
			
			rStart++;
			cStart++;
			
			rMin = rStart;
			cMin = cStart;
			
			index++;
		}

	}
}
