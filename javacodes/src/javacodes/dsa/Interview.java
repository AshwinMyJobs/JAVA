package javacodes.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Interview {

	public static void main(String[] args) {

		List<String> list1 = Arrays.asList("aa","bb","cc");
		List<String> list2 = Arrays.asList("cc","dd","aa");
		
		List<String> list3 = list1.stream().filter(x->x.equals("aa")).collect(Collectors.toList());
		List<String> list4 = list1.stream().filter(x->x.equals("aa")).collect(Collectors.toList());
		list3.addAll(list4);
		System.out.println(list3);
	}

}
