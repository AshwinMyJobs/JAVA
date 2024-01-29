package javacodes.java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A_List_04_PrintOddEven {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		System.out.println("Input");
		System.out.println(intList);
		System.out.println();
		
		List<Integer> oddList = intList.stream().filter(e->e%2!=0).collect(Collectors.toList());
		System.out.println("OddList");
		System.out.println(oddList);
		System.out.println();
		
		List<Integer> evenList = intList.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println("EvenList");
		System.out.println(evenList);
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
		//Print odd even numbers
		System.out.println("Practice function 1");
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		List<Integer> oddList = intList.stream().filter(e->e%2!=0).collect(Collectors.toList());
		System.out.println(oddList);
		List<Integer> evenList = intList.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(evenList);
		System.out.println();
	}
	
	private static void practiceFunction2() {
		//PrintODdEevenNumbers
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		System.out.println("InputList");
		System.out.println(intList);
		List<Integer> oddList = intList.stream().filter(e->e%2!=0).collect(Collectors.toList());
		List<Integer> evenList = intList.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(oddList);
		System.out.println(evenList);
		System.out.println();
	}
	
	private static void practiceFunction3() {
		//PrintOddEvenNumbers
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		System.out.println("InputList");
		System.out.println(intList);
		List<Integer> oddList = intList.stream().filter(e->e%2!=0).collect(Collectors.toList());
		List<Integer> evenList = intList.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(oddList);
		System.out.println(evenList);
		System.out.println();
	}

	private static void practiceFunction4() {
		//PrintOddEvenNumbers
		System.out.println("FromMethod4");
		List<Integer> intList = Arrays.asList(1,2,3,4,56,7,8,9,10);
		System.out.println("InputList");
		System.out.println(intList);
		
		List<Integer> oddList = intList.stream().filter(e->e%2!=0).collect(Collectors.toList());
		List<Integer> evenList = intList.stream().filter(e->e%2==0).collect(Collectors.toList());
		
		System.out.println("OddList");
		System.out.println(oddList);
		System.out.println("EvenList");
		System.out.println(evenList);
		
		System.out.println();
		
	}
	
	private static void practiceFunction5() {
		//PrintOddEvenNumbers
		System.out.println("FromMethod4");
		List<Integer> intList = Arrays.asList(1,2,3,4,56,7,8,9,10);
		System.out.println("InputList");
		System.out.println(intList);
		
		List<Integer> oddList = intList.stream().filter(e->e%2!=0).collect(Collectors.toList());
		List<Integer> evenList = intList.stream().filter(e->e%2==0).collect(Collectors.toList());
		
		System.out.println("OddList");
		System.out.println(oddList);
		System.out.println("EvenList");
		System.out.println(evenList);
		
		System.out.println();

	}

	private static void practiceFunction6() {
		//PrintOddEvenNumbers
		System.out.println("FromMethod5");
		List<Integer> intList = Arrays.asList(1,2,3,4,56,7,8,9,10);
		System.out.println("InputList");
		System.out.println(intList);
		
		List<Integer> oddList = intList.stream().filter(e->e%2!=0).collect(Collectors.toList());
		List<Integer> evenList = intList.stream().filter(e->e%2==0).collect(Collectors.toList());
		
		System.out.println("OddList");
		System.out.println(oddList);
		System.out.println("EvenList");
		System.out.println(evenList);
		
		System.out.println();
	}
}