package javacodes.dsa.stacks;

import java.util.Stack;

public class BalencedParanthesis {

	//Not completely working
	public static void main(String[] args) {

		String A = "))))((((";
		System.out.println(solve(A));
	}

    private static int solve(String A) {
    	
    	Stack<String> bracketStack = new Stack<>();
    	
    	for(int i=0; i<A.length(); i++) {
    		if(isOpenParanthesis(A.charAt(i))) {
    			bracketStack.push(String.valueOf(A.charAt(i)));
    		}else {
    			if(bracketStack.size()!=0)
    				bracketStack.pop();
    			else
    				return 0;
    		}
    	}
    	
    	if(bracketStack.size()==0) 
    		return 1;
    	
    	return 0;
    }

	private static boolean isOpenParanthesis(char charAt) {
		String paranthesis = String.valueOf(charAt);
		
		if(paranthesis.equals("(") || paranthesis.equals("{") || paranthesis.equals("["))
			return true;
		return false;
	}
}
