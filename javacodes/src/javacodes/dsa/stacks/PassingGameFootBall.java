package javacodes.dsa.stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class PassingGameFootBall {

	public static void main(String[] args) {
		
		int A = 10;
		int B = 23;
		List<Integer> C = Arrays.asList(86, 63, 60, 0, 47, 0, 99, 9, 0, 0);
		
		int i = solve(A, B, C);
		
		System.out.println(solve(A, B, C));

	}

	
	private static int solve(int A, int B, List<Integer> C) {
		
		Stack<Integer> passStack = new Stack<>();
		
		passStack.add(B);
		for(int i=0; i<C.size(); i++) {
			if(C.get(i)!=0)
				passStack.add(C.get(i));
			else
				passStack.pop();
				
		}
		
		return passStack.peek();
	}
}
