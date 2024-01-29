package javacodes.java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A_List_11_GroupingByMethod {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1,2,2,3,3,3,4,4,4,4,5,5,5,5,5);
		
		Map<Integer, Long> mappedValues = intList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(mappedValues);
		
		mappedValues.forEach((k,v)->System.out.println(k + ":" + v));
		
	}

}
