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

}
