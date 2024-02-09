package javacodes.designpatterns.behavioural.iterator;

public class TestMain {

	public static void main(String[] args) {

		NamesRepository namesRepository = new NamesRepository();

		for (Iterator iterator = namesRepository.getIterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.println(name);
		}
	}
}
