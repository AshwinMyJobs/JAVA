package main;

import java.util.HashMap;
import java.util.Map;

public class TestMain {

	public static void main(String[] args) {

		String s1 = new String("hello");
		String s2 = new String("hello");
		
		System.out.println();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		Map<String, String> hashMap = new HashMap<>();
		hashMap.put(s1, "String1");
		hashMap.put(s2, "String2");
		
		System.out.println(hashMap);
	}

}