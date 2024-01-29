package javacodes.java8.examples;

import java.util.Arrays;
import java.util.List;

public class A_List_02_AverageOfIntegers {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		
		System.out.println("Input");
		System.out.println(intList);
		System.out.println();
		
		Double avg = intList.stream().mapToInt(e->e).average().getAsDouble();
		
		System.out.println("Average : " + avg);
		System.out.println();
		
		practiceFunction1();
		System.out.println();
		practiceFunction2();
		System.out.println();
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
		//Average of all integers
		System.out.println("Practice method 1");
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		Double avg = intList.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println("Avg : " + avg);
		System.out.println();
	}
	
	public static void practiceFunction2() {
		//Average of all integers
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		System.out.println("InputList");
		System.out.println(intList);
		
		Double avg = intList.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println(avg);
		System.out.println();
	}
	
	private static void practiceFunction3() {
		//AverageOfAllNumbers
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		System.out.println("InputList");
		System.out.println(intList);
		Double avg = intList.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println(avg);
		System.out.println();
	}
	
	private static void practiceFunction4() {
		//AverageOfAllNumbers
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		System.out.println("FromMethod4");
		System.out.println("InputList");
		System.out.println(intList);
		Double avg = intList.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println("Avg : " + avg);
		System.out.println();
	}
	
	private static void practiceFunction5() {
		//AverageOfAllNumbers
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		System.out.println("FromMethod5");
		System.out.println("InputList");
		System.out.println(intList);
		Double avg = intList.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println("Avg : " + avg);
		System.out.println();
	}

	private static void practiceFunction6() {
		//AverageOfAllNumbers
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		System.out.println("FromMethod6");
		System.out.println("InputList");
		System.out.println(intList);
		
		Double avg = intList.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println("Avg : " + avg);
		System.out.println();
	}
}
