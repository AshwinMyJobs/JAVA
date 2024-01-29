package javacodes.java8.examples;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class B_Map_01_SortMapByValue {

	public static void main(String[] args) {
		
		Map<String, Integer> inPutMap = new HashMap<>();
		inPutMap.put("z", 5);
		inPutMap.put("f", 4);
		inPutMap.put("q", 3);
		inPutMap.put("o", 2);
		inPutMap.put("l", 1);
		
		System.out.println("InputMap");
		System.out.println(inPutMap);
		
		System.out.println();
		
		System.out.println("SortedMapValues");
		Map<String, Integer> outPutMap =  inPutMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e2, LinkedHashMap::new));
		
		System.out.println(outPutMap);
		
		System.out.println();
	}

}
