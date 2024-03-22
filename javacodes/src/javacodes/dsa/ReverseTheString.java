package javacodes.dsa;

import java.util.stream.Stream;

public class ReverseTheString {

	public static void main(String[] args) {
		solve("bwroafq rfmy eimspekey w wnzjh qisjiabv ya hncn mazvb pfwlcsnkqz muiapt nnvwwx rp bsypbqu ymg bjwapykfil");
		System.err.println("This is main");

	}

	public static String solve(String A) {

		String revString = "";
		String tempString = "";
		boolean ifSpaceNeeded = false;

		for (int i = A.length() - 1; i >= 0; i--) {
			if (A.charAt(i) != ' ' && i >= 0) {
				tempString = tempString + A.charAt(i);
			} else if (!tempString.isEmpty()) {
				String tempStr = "";
				for (int j = tempString.length() - 1; j >= 0; j--) {
					tempStr = tempStr + tempString.charAt(j);
				}

				if (ifSpaceNeeded) {
					revString = revString + " " + tempStr;
				} else {
					revString = revString + tempStr;
					ifSpaceNeeded = true;
				}

				tempString = "";
			}
		}
		boolean isEmpty = true;
		for (int z = 0; z < tempString.length(); z++) {
			if (tempString.charAt(z) != ' ') {
				isEmpty = false;
				break;
			}
		}
		if (!isEmpty) {

			String tempStr = "";
			for (int j = tempString.length() - 1; j >= 0; j--) {
				tempStr = tempStr + tempString.charAt(j);
			}

			if (ifSpaceNeeded) {
				revString = revString + " " + tempStr;
			} else {
				revString = revString + tempStr;
				ifSpaceNeeded = true;
			}

		}

		tempString = new String("     ");
		System.out.println("tempString is empty : " + tempString.isBlank());


		

        String resultString = new String();

        for(int i=0; i<A.length(); i++) {
        	int ascii = A.charAt(i);
        	
        	if(ascii>=65 && ascii<=90) {
        		char ch = (char) (ascii + 32);
        		resultString = resultString + ch;
        	}else {
        		char ch = (char) (ascii - 32);
        		resultString = resultString + ch;
        	}
        }
		
		System.out.println(revString);
		return revString;
		
	}
}