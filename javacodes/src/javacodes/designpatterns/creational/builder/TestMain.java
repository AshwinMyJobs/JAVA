package javacodes.designpatterns.creational.builder;

public class TestMain {

	public static void main(String[] args) {
		
		Person person = new Person.Builder("Ashwin","ashwin.gmail.com").setAddress("India").setAge(45).build();
		
		System.out.println(person);
		
		
		
	}

}
