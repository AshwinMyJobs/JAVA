package javacodes.dsa.arrays1d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArithmeticProgression {

	public static void main(String[] args) {

		ArrayList<Integer> inputList = new ArrayList<>();
		inputList.add(2);
		inputList.add(4);
		inputList.add(1);
		System.out.println(solve(inputList));
	}

	public static int solve(ArrayList<Integer> A) {
		
		Collections.sort(A);
		
		if(A.size()==1 || A.size()==2) return 1;
		
		int diff = A.get(1)-A.get(0);		
		
		for(int i=1; i<A.size()-1;i++) {
			if(A.get(i+1)-A.get(i)!=diff) return -1;
		}
		
		return 1;
	}
}
