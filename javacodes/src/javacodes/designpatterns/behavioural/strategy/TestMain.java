package javacodes.designpatterns.behavioural.strategy;

public class TestMain {

	public static void main(String[] args) {

		OperationManager operationManager = new OperationManager();
		
		operationManager.setStrategy(new Addition());
		
		operationManager.execute(5, 5);
	}
}
