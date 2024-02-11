package javacodes.designpatterns.behavioural.nullobject;

public class TestMain {

	public static void main(String[] args) {
		
		CustomerFactory customerFactory = new CustomerFactory();
		System.out.println(customerFactory.getCustomer("Name1").get());
	}

}
