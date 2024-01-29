package javacodes.java8.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class A_List_10_SecondLowestHigestNumber {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1,3,5,7,9,10,8,2,4,6);
		System.out.println("InputList");
		System.out.println();
		
		System.out.println("SecondLowestNumber");
		List<Integer> secondLowestNumberList = intList.stream().sorted().limit(2).skip(1).collect(Collectors.toList());
		System.out.println(secondLowestNumberList);
		System.out.println();
		
		System.out.println("SecondHigestNumber");
		List<Integer> secondHigestNumberList = intList.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).collect(Collectors.toList());
		System.out.println(secondHigestNumberList);
		System.out.println();
		
		practiceFunction1();
		System.out.println();
		practiceFunction2();
		System.out.println();
	}

	private static void practiceFunction1() {
		//SecondMinAndSecondMaxNumber
		System.out.println("FromMethod1");
		List<Integer> intList = Arrays.asList(1,3,5,7,9,10,8,2,4,6);
		System.out.println("InputList");
		System.out.println(intList);
		System.out.println();
		
		List<Integer> secondMin = intList.stream().sorted().limit(2).skip(1).collect(Collectors.toList());
		List<Integer> secondMax = intList.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).collect(Collectors.toList());
		
		System.out.println("SecondMin");
		System.out.println(secondMin);
		System.out.println("SecondMax");
		System.out.println(secondMax);
		
		System.out.println();
		
	}
	
	private static void practiceFunction2() {
		//SecondMinAndSecondMaxNumber
		System.out.println("FromMethod2");
		List<Integer> intList = Arrays.asList(1,3,5,7,9,10,8,2,4,6);
		System.out.println("InputList");
		System.out.println(intList);
		System.out.println();
		
		List<Integer> secondMin = intList.stream().sorted().limit(2).skip(1).collect(Collectors.toList());
		List<Integer> secondMax = intList.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).collect(Collectors.toList());
		
		System.out.println("SecondMin");
		System.out.println(secondMin);
		System.out.println("SecondMax");
		System.out.println(secondMax);
		
		System.out.println();
	}

}
