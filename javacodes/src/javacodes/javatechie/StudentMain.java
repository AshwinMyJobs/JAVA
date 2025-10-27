package javacodes.javatechie;

import java.util.List;
import java.util.stream.Collectors;

public class StudentMain {

	public static void main(String[] args) {
		
		listOfStudentsRankBetween(StudentUtil.generateListOfStudents(), 1, 5);

	}

	private static void listOfStudentsRankBetween(List<Student> listStudents, int low, int max) {
		
		List<Student> listOfStudents = listStudents.stream().filter(s->(s.getRank()>=low && s.getRank()<=max)).collect(Collectors.toList());
		
		listOfStudents.forEach(System.out::println);
	}
}
