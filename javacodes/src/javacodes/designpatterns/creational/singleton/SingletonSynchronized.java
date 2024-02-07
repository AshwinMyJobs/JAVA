package javacodes.designpatterns.creational.singleton;

public class SingletonSynchronized {
	
	private SingletonSynchronized singletonSynchronized;
	
	private SingletonSynchronized() {}
	
	public synchronized SingletonSynchronized getSingletonInstance() {
		if(singletonSynchronized==null)
			return new SingletonSynchronized();
		else
			return singletonSynchronized;
	}
}
