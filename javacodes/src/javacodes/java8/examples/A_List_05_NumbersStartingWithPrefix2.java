package javacodes.java8.examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class A_List_05_NumbersStartingWithPrefix2 {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(2, 222, 522, 250, 828);
		System.out.println("Input");
		System.out.println(intList);
		System.out.println();
		
		List<String> resultList = intList.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2")).collect(Collectors.toList());
		System.out.println("ResultList");
		System.out.println(resultList);
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
	}

	private static void practiceFunction1() {
		//PrintNumbersStartingWithPrefix2
		System.out.println("Practice Function 1");
		List<Integer> intList = Arrays.asList(2, 222, 522, 250, 828);
		List<String> strList = intList.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2")).collect(Collectors.toList());
		System.out.println(strList);
			
	}
	
	private static void practiceFunction2() {
		//PrintNumbersStartingWithPrefix2
		List<Integer> intList = Arrays.asList(2, 222, 522, 250, 828);
		System.out.println("InputList");
		System.out.println(intList);
		List<String> strList = intList.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2")).collect(Collectors.toList());
		System.out.println(strList);
	}
	
	private static void practiceFunction3() {
		//NumbersStartingWithPrefix2
		List<Integer> intList = Arrays.asList(2, 222, 522, 250, 828);
		System.out.println("InputList");
		System.out.println(intList);
		List<String> strList = intList.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2")).collect(Collectors.toList());
		System.out.println(strList);
		System.out.println();
	}


	private static void practiceFunction4() {
		//NumbersStartingWithPrefix2
		System.out.println("FromMethod4");
		List<Integer> intList = Arrays.asList(2, 222, 522, 250, 828);
		System.out.println("InputList");
		System.out.println(intList);
		
		List<String> strList = intList.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2")).collect(Collectors.toList());
		System.out.println(strList);
		
		System.out.println();
		
	}
	
	private static void practiceFunction5() {
		//NumbersStartingWithPrefix2
		System.out.println("FromMethod5");
		List<Integer> intList = Arrays.asList(2, 222, 522, 250, 828);
		System.out.println("InputList");
		System.out.println(intList);
		
		List<String> strList = intList.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2")).collect(Collectors.toList());
		System.out.println(strList);
		
		System.out.println();
		
	}
}
