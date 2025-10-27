package javacodes.dsa.stacks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class DoubleCharacterTrouble {

	public static void main(String[] args) {

		String A = "abccbc";
		//String A = "aaa";
		//String A = "ababaz";
		
//		System.out.println(A);
//		System.out.println(solve(A));
		
		solveDoubleCharecterProblem(A);

	}

	private static String solve(String A) {

		Stack<String> stringStack = new Stack<>();

		if (A.length() <= 1)
			return A;

		stringStack.push(String.valueOf(A.charAt(0)));
		for (int i = 1; i < A.length(); i++) {
			String currentChar = String.valueOf(A.charAt(i));

			if (stringStack.isEmpty()) {
				stringStack.push(currentChar);
				continue;
			}

			if (!stringStack.peek().equalsIgnoreCase(currentChar))
				stringStack.push(currentChar);
			else
				stringStack.pop();
		}

		if (stringStack.isEmpty())
			return "";

		char[] stringCharArray = stringStack.toString().toCharArray();

		String resultString = new String();
		
		for(int i=1; i<stringCharArray.length-1; i++) {
			if(stringCharArray[i]!=',' && stringCharArray[i]!=']' && stringCharArray[i]!=' ')
				resultString = resultString + stringCharArray[i];
		}
		System.out.println(new String(resultString));
		return resultString;
	}

	private static void solveDoubleCharecterProblem(String A) {
		
		Stack<String> stack = new Stack<>();
		
		for(int i=0; i<A.length(); i++) {
			if(stack.isEmpty()) {
				stack.push(String.valueOf(A.charAt(i)));
			}else {
				if(String.valueOf(A.charAt(i)).equals(stack.peek())){
					stack.pop();
				}else {
					stack.add(String.valueOf(A.charAt(i)));
				}
			}
		}
		
		System.out.println(stack.toString());
		
	}


}
