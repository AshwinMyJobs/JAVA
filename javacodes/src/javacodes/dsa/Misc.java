package javacodes.dsa;

public class Misc {

	public static void main(String[] args) {

//		System.out.println(Integer.toBinaryString(32));
//		System.out.println(Integer.toBinaryString(16));
//		System.out.println(Integer.toBinaryString(8));
//		System.out.println(Integer.toBinaryString(4));
//		System.out.println(Integer.toBinaryString(24));
//		System.out.println(Integer.toBinaryString(36));
//		System.out.println(Integer.toBinaryString(80));
//		System.out.println(Integer.toBinaryString(82));
//		System.out.println(Integer.toBinaryString(128));
//		System.out.println(Integer.toBinaryString(138));
//
//		
//		int x = Integer.parseInt("10000000", 2);
//		System.out.println(x);
		
		
		checkBit(10, 2);
	}
	
	
	public static void checkBit(int x, int pos) {
		
		System.out.println(Integer.toBinaryString(x));
		System.out.println();
		System.out.println(Integer.toBinaryString(10));
		System.out.println("  "+Integer.toBinaryString(1<<1));
		System.out.println("======================================");
		System.out.println("  "+Integer.toBinaryString(10&1<<1));
		
		System.out.println("======================================");
		
		System.out.println();System.out.println();System.out.println();
		
		System.out.println(Integer.toBinaryString(8));
		System.out.println();
		System.out.println(Integer.toBinaryString(8));
		System.out.println("  "+Integer.toBinaryString(1<<1));
		System.out.println("======================================");
		System.out.println("  "+Integer.toBinaryString(8&1<<1));
		
		System.out.println("======================================");
		
		
		
		
		
		
		
//		int z = x + 1<<1;
//		System.out.println(Integer.toString(z, 2));
//		System.out.println(z);
		
	}
}

