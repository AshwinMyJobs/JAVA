package javacodes.java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A_List_03_SquareFilterAverage {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		System.out.println("Input");
		System.out.println(intList);
		System.out.println();
		
		//Step1 : Square the numbers in the list and collect it
		List<Integer> squaredList = intList.stream().map(e->e*e).collect(Collectors.toList());
		System.out.println(squaredList);
		System.out.println();
		
		//Step2 : Filter the squaredList with greater than 10 condition
		List<Integer> filteredList = squaredList.stream().filter(e->e>10).collect(Collectors.toList());
		System.out.println(filteredList);
		System.out.println();
		
		//Step3 : Average on the filtered list and collect as double
		Double avg = filteredList.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println(avg);
		System.out.println();
		
		//All steps in one flow
		System.out.println("All Steps in one flow");
		avg = intList.stream().map(e->e*e).filter(e->e>10).mapToInt(e->e).average().getAsDouble();
		System.out.println(avg);
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
		//SquareFilterAverage
		System.out.println("Practice Function 1");
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		Double avg = intList.stream().map(e->e*e).filter(e->e>10).mapToInt(e->e).average().getAsDouble();
		System.out.println("Avg : " + avg);
		System.out.println();
	}
	
	private static void practiceFunction2() {
		//SquareFilterAverage
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		Double avg = intList.stream().map(e->e*e).filter(e->e>10).mapToInt(e->e).average().getAsDouble();
		System.out.println("InputList");
		System.out.println(intList);
		System.out.println(avg);
	}
	
	private static void practiceFunction3() {
		//SquareFilterAverage
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		System.out.println("InputList");
		System.out.println(intList);
		Double avg = intList.stream().map(e->e*e).filter(e->e>10).mapToInt(e->e).average().getAsDouble();
		System.out.println(avg);
	}
	
	private static void practiceFunction4() {
		//SquareFilterAverage
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		System.out.println("FromMethod4");
		System.out.println("InputList");
		System.out.println(intList);
		Double avg = intList.stream().map(e->e*e).filter(e->e>10).mapToInt(e->e).average().getAsDouble();
		System.out.println("Avg : " + avg);
		System.out.println();
	}
	
	private static void practiceFunction5() {
		//SquareFilterAverage
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		System.out.println("FromMethod5");
		System.out.println("InputList");
		System.out.println(intList);
		Double avg = intList.stream().map(e->e*e).filter(e->e>10).mapToInt(e->e).average().getAsDouble();
		System.out.println("Avg : " + avg);
		System.out.println();
	}
	
	private static void practiceFunction6() {
		//SquareFilterAverage
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		System.out.println("FromMethod6");
		System.out.println("InputList");
		System.out.println(intList);
		Double avg = intList.stream().map(e->e*e).filter(e->e>10).mapToInt(e->e).average().getAsDouble();
		System.out.println("Avg : " + avg);
		System.out.println();
	}
}
