package javacodes.java8.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A_List_06_DuplicateNumbers {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,3,5,7,9);
		System.out.println("InputList");
		System.out.println(intList);
		
		System.out.println();
		System.out.println("Method1");
		Set<Integer> dupSet1 = intList.stream().filter(e->Collections.frequency(intList, e)>1).collect(Collectors.toSet());
		System.out.println(dupSet1);
		System.out.println();
		
		System.out.println("Method2");
		Set<Integer> intSet = new HashSet<>();
		Set<Integer> dupSet2 = intList.stream().filter(e->!intSet.add(e)).collect(Collectors.toSet());
		System.out.println(dupSet2);
		System.out.println();
		
		practiceFunction1();
		System.out.println();
		practiceFunction2();
		System.out.println();
	}

	private static void practiceFunction1() {
		//DuplicateNumbersInList
		System.out.println("FromMethod1");
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,3,5,7,9);
		System.out.println("InputList");
		System.out.println(intList);
		System.out.println();
		
		System.out.println("Solution#1");
		Set<Integer> dupSet1 = intList.stream().filter(e->Collections.frequency(intList, e)>1).collect(Collectors.toSet());
		System.out.println(dupSet1);
		
		System.out.println("Solution#2");
		Set<Integer> hashSet = new HashSet<>();
		Set<Integer> dupSet2 = intList.stream().filter(e->!hashSet.add(e)).collect(Collectors.toSet());
		System.out.println(dupSet2);
		
		System.out.println();
		
	}

	private static void practiceFunction2() {
		//DuplicateNumbersInList
		System.out.println("FromMethod2");
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,3,5,7,9);
		System.out.println("InputList");
		System.out.println(intList);
		System.out.println();
		
		//Method1
		System.out.println("Solution#1");
		Set<Integer> dupSetOne = intList.stream().filter(e->Collections.frequency(intList, e)>1).collect(Collectors.toSet());
		System.out.println(dupSetOne);
		
		//Method2
		System.out.println("Solution#2");
		Set<Integer> hashSet = new HashSet<>();
		Set<Integer> dupSetTwo = intList.stream().filter(e->!hashSet.add(e)).collect(Collectors.toSet());
		System.out.println(dupSetTwo);
		
		System.out.println();
		
	}
}
