package javacodes.javatechie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentUtil {

	public static List<Student> generateListOfStudents() {
		List<Student> studentsList = new ArrayList<Student>();
		
		studentsList = Stream.of(
									new Student(1,  "fn1", "ln1", "m", "Cse", "Bengaluru", 1, Arrays.asList("990908901")),
									new Student(2,  "fn2", "ln2", "f", "Iem", "Chennai", 2, Arrays.asList("990908902")),
									new Student(3,  "fn3", "ln3", "m", "Mech", "Mumbai", 3, Arrays.asList("990908903")),
									new Student(4,  "fn4", "ln4", "f", "Chem", "Hydrabad", 4, Arrays.asList("990908904")),
									new Student(5,  "fn5", "ln5", "m", "Ec", "Vishakapatnam", 5, Arrays.asList("990908905")),
									new Student(6,  "fn6", "ln6", "f", "Cse", "Bengaluru", 6, Arrays.asList("990908906")),
									new Student(7,  "fn7", "ln7", "m", "Iem", "Chennai", 7, Arrays.asList("990908907")),
									new Student(8,  "fn8", "ln8", "f", "Nanotech", "Mumbai", 8, Arrays.asList("990908908")),
									new Student(9,  "fn9", "ln9", "m", "Chem", "Mumbai", 9, Arrays.asList("990908909")),
									new Student(10, "fn10", "ln10", "f", "Biotech", "Vishakapatnam", 10, Arrays.asList("990908910"))
								).collect(Collectors.toList());
		
		return studentsList;
	}
}
