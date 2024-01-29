package javacodes.java8.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class A_List_08_SortingNumbers {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1,3,5,7,9,10,8,2,4,6);
		System.out.println("InputList");
		System.out.println(intList);
		System.out.println();
		
		List<Integer> ascendingList = intList.stream().sorted().collect(Collectors.toList());
		System.out.println(ascendingList);
		List<Integer> descendingList = intList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(descendingList);
		System.out.println();
		
		practiceFunction1();
		System.out.println();
		practiceFunction2();
		System.out.println();
	}

	private static void practiceFunction1() {
		//SortingTheList
		System.out.println("FromMethod1");
		List<Integer> intList = Arrays.asList(1,3,5,7,9,10,8,2,4,6);
		System.out.println("InputList");
		System.out.println(intList);
		System.out.println();
		
		List<Integer> ascList = intList.stream().sorted().collect(Collectors.toList());
		List<Integer> descList = intList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		System.out.println("AscendingList");
		System.out.println(ascList);
		System.out.println("DecendingList");
		System.out.println(descList);
		
		System.out.println();
		
	}

	private static void practiceFunction2() {
		//SortingTheList
		System.out.println("FromMethod2");
		List<Integer> intList = Arrays.asList(1,3,5,7,9,10,8,2,4,6);
		System.out.println("InputList");
		System.out.println(intList);
		System.out.println();
		
		List<Integer> ascList = intList.stream().sorted().collect(Collectors.toList());
		List<Integer> descList = intList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(ascList);
		System.out.println(descList);
		
		System.out.println();
	}
}
