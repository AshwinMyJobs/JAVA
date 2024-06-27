package javacodes.dsa.stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class EvaluateExpression {

	public static void main(String[] args) {

		ArrayList<String> A = new ArrayList<>();
		
		//A.add("2");A.add("1");A.add("+");A.add("3");A.add("*");
		A.add("4");A.add("13");A.add("5");A.add("/");A.add("+");
		
		System.out.println(evalRPN(A));
	}

	public static int evalRPN(ArrayList<String> A) {
    
    	Stack<String> intStack = new Stack<>();
    	
    	//intStack.add(A.get(0));
    	for(int i=0; i<A.size(); i++) {
    		
    		if( !isOperand(A.get(i))) {
    			intStack.add(A.get(i));
    		}else {
    			int b = Integer.valueOf(intStack.pop());
    			int a = Integer.valueOf(intStack.pop());
    			intStack.add(String.valueOf(calculate(a, b, A.get(i))));
    		}
    	}
    	return Integer.valueOf(intStack.pop());
    }

	private static boolean isOperand(String input) {

		if (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/"))
			return true;
		else
			return false;
	}
	
	private static int calculate(int a, int b, String operation) {
		
		if(operation.equals("+")) {
			return a+b;
		}
		if(operation.equals("-")) {
			return a-b;
		}
		if(operation.equals("*")) {
			return a*b;
		}
		if(operation.equals("/")) {
			return a/b;
		}
		return 0;
	}
}
