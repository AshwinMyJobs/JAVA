package javacodes.designpatterns.behavioural.strategy;

public class OperationManager {

	private Strategy strategy;

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void execute(int a, int b) {
		strategy.execute(a, b);
	}
}
