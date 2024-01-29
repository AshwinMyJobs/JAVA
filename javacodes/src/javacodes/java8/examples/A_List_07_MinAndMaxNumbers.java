package javacodes.java8.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class A_List_07_MinAndMaxNumbers {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(6,7,8,9,10,1,2,3,4,5);
		
		System.out.println("InputList");
		System.out.println(intList);
		int minNumber = intList.stream().min(Comparator.comparing(Integer::intValue)).get();
		System.out.println("Min : " + minNumber);
		int maxNumber = intList.stream().max(Comparator.comparing(Integer::intValue)).get();
		System.out.println("Max : " + maxNumber);
		System.out.println();
		
		practiceFunction1();
		System.out.println();
		practiceFunction2();
		System.out.println();
	}

	private static void practiceFunction1() {
		//MinAndMaxNumbers
		System.out.println("FromMethod1");
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println("InputList");
		System.out.println(intList);
		System.out.println();
		
		Integer min = intList.stream().min(Comparator.comparing(Integer::intValue)).get();
		Integer max = intList.stream().max(Comparator.comparing(Integer::intValue)).get();
		
		System.out.println("Min : " + min);
		System.out.println("Max : " + max);
		
		System.out.println();
	}
	
	private static void practiceFunction2() {
		//MinAndMaxNumbers
		System.out.println("FromMethod2");
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println("InputList");
		System.out.println(intList);
		System.out.println();
		
		int min = intList.stream().min(Comparator.comparing(Integer::intValue)).get();
		int max = intList.stream().max(Comparator.comparing(Integer::intValue)).get();
		
		System.out.println("Min : " + min);
		System.out.println("Max : " + max);
		
		System.out.println();
	}

}
