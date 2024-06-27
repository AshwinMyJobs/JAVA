package javacodes.dsa.stacks;

import java.util.HashMap;
import java.util.Stack;

public class InfixToPostFix {

	public static void main(String[] args) {

	}

	public static String solve(String A) {

		Stack<String> postFixStack = new Stack<>();

		String outputString = "";

		for(int index=0; index<A.length(); index++) {

			if (postFixStack.isEmpty()) {
				postFixStack.push(String.valueOf(A.charAt(index)));
			} else {
				if (String.valueOf(A.charAt(index)).equals("(")) {
					postFixStack.push(String.valueOf(A.charAt(index)));
					continue;
				} else if (isCharecter(A.charAt(index))) {
					outputString = outputString + String.valueOf(A.charAt(index));
					index++;
				} else {
					if(isPrecedenceLow(postFixStack.peek(), String.valueOf(A.charAt(index)))) {
						postFixStack.push(String.valueOf(A.charAt(index)));
					}else {
						boolean flag = true;
						
					}
				}

			}

		}

		return null;
	}

	private static boolean isCharecter(char z) {
		if (z >= 'a' && z <= 'z')
			return true;
		return false;
	}

	private static boolean isPrecedenceLow(String peekValue, String currentValue) {

		HashMap<String, Integer> mp = new HashMap<>();
		mp.put("(", 4);
		mp.put(")", 4);
		mp.put("^", 3);
		mp.put("/", 2);
		mp.put("*", 2);
		mp.put("+", 1);
		mp.put("-", 1);

		if (mp.get(peekValue) > mp.get(currentValue))
			return true;
		return false;

	}
}
