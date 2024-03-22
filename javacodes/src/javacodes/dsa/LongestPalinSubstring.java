package javacodes.dsa;

public class LongestPalinSubstring {
    public static void main(String[] args) {
		String inputString = longestPalindrome("XYZYXqzzzzzwwzzzzz");
		System.out.println(inputString);
	}
    
    private static String longestPalindrome(String A) {
    	
    	if(A.length()<=1) return A;
    	
    	String longestPalindromeString = "";
    	
    	for(int i=1;i<A.length(); i++) {
    		
    		//Workout for odd length
    		int low = i;
    		int high = i;
    		
    		while(A.charAt(low)==A.charAt(high)) {
    			low--;
    			high++;
    			
    			if(low==-1 || high==A.length()) break;
    		}
    		
    		String palindrome = A.substring(low+1, high);
    		if(palindrome.length()>longestPalindromeString.length())
    			longestPalindromeString = palindrome;
    		
    		//Workout for odd length
    		low = i-1;
    		high =i;
    		while(A.charAt(low)==A.charAt(high)) {
    			low--;
    			high++;
    			
    			if(low==-1 || high==A.length()) break;
    		}
    		
    		palindrome = A.substring(low+1, high);
    		if(palindrome.length()>longestPalindromeString.length())
    			longestPalindromeString = palindrome;
    	}
    	
    	return longestPalindromeString;
    }
}