package javacodes.dsa;

public class TowerOfHonnai {
	public static void main(String[] args) {
		
	}
	
	private void towerOfHanoi(int N, String source,  String destination, String helper) {
		if(N==0) {
			return;
		}
		towerOfHanoi(N-1, source , helper, destination);
		towerOfHanoi(N-1, helper, destination, source);
	}
}
