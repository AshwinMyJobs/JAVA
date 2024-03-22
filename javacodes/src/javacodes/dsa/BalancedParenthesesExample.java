package javacodes.dsa;

import java.util.*;

public class BalancedParenthesesExample {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static boolean balancedParenthesis(String str) {
		Stack<Character> stack = new Stack<>();
		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			char current = charArray[i];

			if (current == '{' || current == '[' || current == '(') {
				stack.push(current);
				continue;
			}

			if (stack.isEmpty()) {
				return false;
			}

			switch (current) {
			case '}':
				if (stack.pop() != '{') {
					return false;
				}
				break;
			case ']':
				if (stack.pop() != '[') {
					return false;
				}
				break;
			case ')':
				if (stack.pop() != '(') {
					return false;
				}
				break;
			default:
				// Ignore non-bracket characters
				break;
			}
		}

		// If there are unmatched starting brackets left in the stack, it's unbalanced
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String input = "{[()]()}"; // Example input string
		boolean isBalanced = balancedParenthesis(input);
		System.out.println("Is the input string balanced? " + isBalanced);
	}
}
