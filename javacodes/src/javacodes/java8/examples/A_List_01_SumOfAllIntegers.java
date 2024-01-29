package javacodes.java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class A_List_01_SumOfAllIntegers {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		
		Optional<Integer> sum = intList.stream().reduce((a,b)->a+b);
		
		System.out.println("Input list of integers");
		System.out.println(intList);
		
		System.out.println();
		System.out.println("Sum of all integers : " + sum.get());
		System.out.println();
		
		practiceFunction1();
		System.out.println();
		practiceFunction2();
		practiceFunction3();
		System.out.println();
		practiceFunction4();
		System.out.println();
		practiceFunction5();
		System.out.println();
		practiceFunction6();
		System.out.println();
	}

	private static void practiceFunction1() {
		//Sum of All integers
		System.out.println("Practice method 1");
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		Integer sum = intList.stream().reduce((a,b)->a+b).get();
		System.out.println("Sum : " + sum);
		System.out.println();
	}
	
	private static void practiceFunction2() {
		//Sum of all integers
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		System.out.println("InputList");
		System.out.println(intList);
		System.out.println();
		
		int sum = intList.stream().reduce((a,b)->a+b).get();
		System.out.println("Sum : " + sum);
		System.out.println();
	}
	
	private static void practiceFunction3() {
		//SumOFAllIntegers
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		System.out.println("InputList");
		System.out.println(intList);
		int sum = intList.stream().reduce((a,b)->a+b).get();
		System.out.println("Sum : " + sum);
		System.out.println();
	}
	
	private static void practiceFunction4() {
		//SumOfAllIntegers
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		System.out.println("FromMethod4");
		System.out.println("InputList");
		System.out.println(intList);
		int sum = intList.stream().reduce((a,b)->a+b).get();
		System.out.println("Sum : " + sum);
		System.out.println();
	}
	
	private static void practiceFunction5() {
		//SumOfAllIntegers
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		System.out.println("FromMethod5");
		System.out.println("InputList");
		System.out.println(intList);
		int sum = intList.stream().reduce((a,b)->a+b).get();
		System.out.println("Sum : " + sum);
		System.out.println();
		
	}

	private static void practiceFunction6() {
		//SumOfAllIntegers
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		System.out.println("FromMethod6");
		System.out.println("InputList");
		System.out.println(intList);
		int sum = intList.stream().reduce((a,b)->a+b).get();
		System.out.println("Sum : " + sum);
		System.out.println();
	}
}