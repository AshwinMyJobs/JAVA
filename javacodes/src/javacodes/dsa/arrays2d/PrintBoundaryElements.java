package javacodes.dsa.arrays2d;

public class PrintBoundaryElements {

	public static void solve(int[][] inputArray) {
		
		int i=0, j=0;
		
		System.out.println("Method one !!!!");
		for(int k=1; k<inputArray.length; k++) {
			System.out.print(inputArray[i][j] + ",");
			j++;
		}
		for(int k=1; k<inputArray.length; k++) {
			System.out.print(inputArray[i][j] + ",");
			i++;
		}
		for(int k=1; k<inputArray.length; k++) {
			System.out.print(inputArray[i][j] + ",");
			j--;
		}
		for(int k=1; k<inputArray.length; k++) {
			System.out.print(inputArray[i][j] + ",");
			i--;
		}
		
		System.out.println();
		System.out.println("Method two !!!!");
		i=0;
		j=0;
		System.out.print("{");
		while(j<inputArray.length) {
			System.out.print(inputArray[i][j] + ",");
			if(j==inputArray.length-1) break;
			j++;
		}
		i++;
		while(i<inputArray.length) {
			System.out.print(inputArray[i][j] + ",");
			if(i==inputArray.length-1) break;
			i++;
		}
		j--;
		while(j>=0) {
			System.out.print(inputArray[i][j] + ",");
			if(j==0) break;
			j--;
		}
		i--;
		while(i>0) {
			if(i==1)
				System.out.print(inputArray[i][j]);
			else
				System.out.print(inputArray[i][j] + ",");
			i--;
		}
		System.out.print("}");
	}
}