package javacodes.dsa;

public class PalindromeRecurciveFunction {

	public static void main(String[] args) {
		String inputString = "namzan";
		System.out.println(isPalindrome(inputString));
	}

	private static boolean isPalindrome(String A) {
		
		if(A.length()<=1) {
			return true;
		}
		
	    char firstChar = A.charAt(0);
	    char lastChar = A.charAt(A.length() - 1);

	    if (firstChar != lastChar) {
	      return false;
	    }

	    String remainingSubstring = A.substring(1, A.length() - 1);
	    return isPalindrome(remainingSubstring);

	}
}
