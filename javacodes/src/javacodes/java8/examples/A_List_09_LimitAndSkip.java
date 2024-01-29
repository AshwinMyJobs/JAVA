package javacodes.java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A_List_09_LimitAndSkip {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println("InputList");
		System.out.println(intList);
		
		System.out.println("LimitTo5Numbers");
		List<Integer> limitList = intList.stream().limit(5).collect(Collectors.toList());
		System.out.println(limitList);
		System.out.println();
		
		System.out.println("SkipList5Numbers");
		List<Integer> skipList = intList.stream().skip(5).collect(Collectors.toList());
		System.out.println(skipList);
		System.out.println();
		
		practiceFunction1();
		System.out.println();
		practiceFunction2();
		System.out.println();
	}


	private static void practiceFunction1() {
		//LimitAndSkip
		System.out.println("FromMethod1");
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println("InputList");
		System.out.println(intList);
		System.out.println();
		
		List<Integer> limitList = intList.stream().limit(5).collect(Collectors.toList());
		List<Integer> skipList = intList.stream().skip(5).collect(Collectors.toList());
		
		System.out.println("LimitList");
		System.out.println(limitList);
		System.out.println("SkipList");
		System.out.println(skipList);
		
		System.out.println();
	}

	private static void practiceFunction2() {
		//LimitAndSkip
		System.out.println("FromMethod2");
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println("InputList");
		System.out.println(intList);
		System.out.println();
		
		List<Integer> limitList = intList.stream().limit(5).collect(Collectors.toList());
		List<Integer> skipList = intList.stream().skip(5).collect(Collectors.toList());
		
		System.out.println("LimitList");
		System.out.println(limitList);
		System.out.println("SkipList");
		System.out.println(skipList);
		
		System.out.println();
		
	}
}
